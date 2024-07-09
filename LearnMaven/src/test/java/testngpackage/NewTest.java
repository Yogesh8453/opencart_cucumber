package testngpackage;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver wd = new ChromeDriver();
	Properties prop = new Properties();
  @Test(priority = 1)
  public void openapp() {
	  wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  System.out.println("App opened");
  }
  @Test(priority = 2)
  public void login() throws InterruptedException {
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  wd.findElement(By.name("password")).sendKeys("admin123");
	  wd.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  System.out.println("Login Successful");
  }
  @Test(priority = 3)
  public void close () {
	  System.out.println("App closed");
	  wd.quit();
  }
}
