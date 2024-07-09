package pageobjectmodaldemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {

	WebDriver wd;

	// Constructor

	LoginPage2(WebDriver wd)
	{
		this.wd = wd;
		PageFactory.initElements(wd, this);
	}

	// Locators

	/* By txt_username_loc = (By.xpath("//input[@placeholder='Username']"));
	By txt_password_loc = (By.xpath("//input[@placeholder='Password']"));
	By btn_login_loc = (By.xpath("//button[normalize-space()='Login']"));
	*/
	
	@FindBy(how=How.XPATH, using = "//input[@placeholder='Username']") WebElement txt_username;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement btn_login;
	
	

	// Action Methods

	public void setUserName(String User) {
		txt_username.sendKeys(User);
	}

	public void setPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void clickLogin() {
		btn_login.click();
	}
}
