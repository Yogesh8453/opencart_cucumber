package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://the-internet.herokuapp.com/javascript_alerts");
		wd.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		Thread.sleep(3000);
		wd.quit();
	}

}
