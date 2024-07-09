package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver wd;
	
	public BasePage(WebDriver wd)
	{
		this.wd=wd;
		PageFactory.initElements(wd, this);
	}
 
}
