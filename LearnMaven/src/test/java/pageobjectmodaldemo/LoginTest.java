package pageobjectmodaldemo;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver wd;
	@BeforeClass
	void setup()
	{
		wd=new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	void testLogin()
	{
		LoginPage2 obj = new LoginPage2(wd);
		obj.setUserName("Admin");
		obj.setPassword("admin123");
		obj.clickLogin();
		
		Assert.assertEquals(wd.getTitle(),"OrangeHRM");
		
	}
	@AfterClass
	void tearDown()
	{
		wd.quit();
	}

}
