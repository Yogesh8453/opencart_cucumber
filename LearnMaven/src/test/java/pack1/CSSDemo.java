package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		/*
		 * wd.get("https://demo.nopcommerce.com/");
		 * wd.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Hello");
		 * wd.findElement(By.cssSelector("input.search-box-text")).sendKeys("World");
		 * wd.findElement(By.cssSelector("input[name='q']")).sendKeys("Tag & Atttri");
		 */
		
		wd.get("https://www.discounttire.com/");
		Thread.sleep(5000);
		wd.findElement(By.cssSelector("button[aria-label='What can we help you find?']")).click();
		wd.findElement(By.cssSelector("input[aria-label='What can we help you find?']")).sendKeys("test");
		Thread.sleep(10000);

	}

}
