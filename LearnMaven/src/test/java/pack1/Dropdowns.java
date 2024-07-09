package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).click();
		Thread.sleep(5000);
		wd.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		List <WebElement> Options = wd.findElements(By.xpath("//ul[@role='listbox']//li[@role='option']"));
		for(WebElement op :Options)
		{
	//	System.out.println(op.getText());	
		if(op.getText().equals("Selenium"))
				{
			op.click(); 
			break;
				}
		}
		
	}

}
