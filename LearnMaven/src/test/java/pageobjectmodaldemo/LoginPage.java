package pageobjectmodaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver wd;
	
	//Constructor
	
	LoginPage(WebDriver wd)
	{
		this.wd = wd;
	}
	
	//Locators
	
	By txt_username_loc =(By.xpath("//input[@placeholder='Username']"));
	By txt_password_loc	=(By.xpath("//input[@placeholder='Password']"));
	By btn_login_loc=(By.xpath("//button[normalize-space()='Login']"));
	
	//Action Methods
	
	public void setUserName(String User)
	{
		wd.findElement(txt_username_loc).sendKeys(User);
	}
	public void setPassword(String pwd)
	{
		wd.findElement(txt_password_loc).sendKeys(pwd);
	}
	public void clickLogin()
	{
		wd.findElement(btn_login_loc).click();
	}
}
