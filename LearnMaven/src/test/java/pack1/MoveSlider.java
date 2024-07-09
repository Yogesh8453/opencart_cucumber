package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveSlider {

	public static void main(String[] args) {
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/#google_vignette");
		//wd.manage().window().maximize();
		WebElement minslider=wd.findElement(By.xpath("//span[1]"));
		System.out.println(minslider.getLocation());
		Actions act = new Actions(wd);
		act.dragAndDropBy(minslider, 100, 249).perform();
		
		

	}

}
