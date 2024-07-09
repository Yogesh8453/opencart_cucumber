package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {
	
	@Test(groups = {"sanity", "regression", "master"})
	public void verify_login() {
		
		logger.info("***TC002_LoginTest Started***");
		try
		{
		//HomePage 
		HomePage hp = new HomePage(wd);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//LoginPage
		LoginPage lp = new LoginPage(wd);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage myac = new MyAccountPage(wd);
		
		boolean targetpage = myac.isMyAccounPagePresent();
		Assert.assertTrue(targetpage);
		}
		catch (Exception e) {
			Assert.fail();
		}
		logger.info("****TC002 LoginTest Complete****");
	}

}

