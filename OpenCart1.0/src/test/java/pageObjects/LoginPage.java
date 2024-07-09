package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver wd) {
		super(wd);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtLoginPassword;
	@FindBy(xpath = "//input[@value='Login']") 
	WebElement btnLogin;
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setPassword(String pwd) {
		txtLoginPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}
}
