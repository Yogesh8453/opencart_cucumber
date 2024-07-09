package pack1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver wd = new ChromeDriver();
		wd.get("https://testautomationpractice.blogspot.com/");
		wd.manage().window().maximize();
		/*
		 * wd.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys(
		 * "Selenium");
		 * wd.findElement(By.cssSelector("input.wikipedia-search-button")).click();
		 * Thread.sleep(5000); //wd.findElement(By.partialLinkText("Sele")).click();
		 * List<WebElement> Search_Result = wd.findElements(By.partialLinkText("Sele"));
		 * Thread.sleep(3000); // System.out.println(Search_Result); for(int i = 0;
		 * i<Search_Result.size(); i++) { Search_Result.get(i).click(); }
		 * Set<String>W=wd.getWindowHandles(); //wd.switchTo().window(W); for(String W1:
		 * W) { System.out.println(W1); wd.switchTo().window(W1);
		 * 
		 * 
		 * }
		 */
		
		
		
		
		//Thread.sleep(5000);
		//wd.quit();
		

	}

}
