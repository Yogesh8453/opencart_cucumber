package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver wd) {
		super(wd);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtNumber;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	@FindBy(xpath = "//label[normalize-space()='Yes']")
	WebElement btnSubscribe;
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPolicyTerms;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String Lname) {
		txtLastName.sendKeys(Lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	public void setNumber(String tel) {
		txtNumber.sendKeys(tel);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);
	}
	public void clickSubscribe() {
		btnSubscribe.click();
	}

	public void clickPolicyTerms() {
		chkPolicyTerms.click();
	}

	public void clickContinue() {
		btnContinue.click();
	}

	public String getMsgConfirmation() {
		try {
			return msgConfirmation.getText();
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
