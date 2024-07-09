package testngpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DataProviderDemo {
	WebDriver wd;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
		
		switch(br)
		{
		case "chrome":	wd=new ChromeDriver();break; 
		case "edge":	wd= new EdgeDriver();break;
		case "firefox": wd=new FirefoxDriver();break;
		default :System.out.println("Enter proper browser");return;
		
		}
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dataProvider = "dp")
	void login(String email, String pwd) throws InterruptedException
	{
	
	wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	wd.manage().window().maximize();
	wd.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
	wd.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	wd.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	//Thread.sleep(2000);
	boolean status=wd.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
	if(status==true)
	{
		System.out.println("Test Passed");
		Assert.assertEquals(status, true);
	}
	else
	{
		System.out.println("Test Failed");
		Assert.fail();
	}
	
	}
	@AfterClass
	void tearDown()
	{
		wd.quit();
	}

	@DataProvider(name="dp")
	Object[][] logindata()
	{
		Object data[][]= 
			{
					/*{"Admin1","123"},
					{"Admin2","234"},*/
					{"Admin","admin123"}
			
				
		};
		return data;
		
	}
}
