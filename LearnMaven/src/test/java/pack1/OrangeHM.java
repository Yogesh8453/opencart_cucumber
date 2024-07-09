package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHM {

	public static void main(String[] args) throws InterruptedException {


		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		WebElement username=wd.findElement(By.name("username"));
		username.sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String ActualTitle=wd.getTitle();
		String ExpectedTitle="OrangeHRM";
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		wd.quit();
		wd.findElements(By.partialLinkText("abc"));
	}

}
