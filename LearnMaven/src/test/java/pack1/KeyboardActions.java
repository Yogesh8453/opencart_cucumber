package pack1;

import java.awt.RenderingHints.Key;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless=new");
		opt.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		opt.addArguments("--incognito");
		WebDriver wd = new ChromeDriver(opt);
		wd.get("https://text-compare.com/");
		wd.manage().window().maximize();
		wd.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome123");
		Thread.sleep(2000);
		Actions act = new Actions(wd);
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		TakesScreenshot ts = (TakesScreenshot)wd;
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		File TargetFile = new File(System.getProperty("user.dir")+"\\screenshots\\firstss.png");
		SourceFile.renameTo(TargetFile);
		System.out.println("Testing done");
		

	}

}
