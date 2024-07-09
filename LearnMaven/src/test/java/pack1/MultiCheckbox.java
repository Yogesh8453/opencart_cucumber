package pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckbox {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://total-qa.com/checkbox-example/");
		List<WebElement> checkboxes=wd.findElements(By.cssSelector("input[type='checkbox']"));
		for(int i=0;  i<checkboxes.size(); i++ )
		{
			checkboxes.get(i).click();
		}
	}

}
