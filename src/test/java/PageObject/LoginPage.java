package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

	public LoginPage() {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@name=\"email-address\"]")
	WebElement username;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement clickOnNext;

	@FindBy(xpath = "//input[@type=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@name=\"next\"]")
	WebElement clickOnSignIn;
	
	
	

	public void username(String name) {
		username.sendKeys(name);
	}

	public void clickOnNext() {
		clickOnNext.click();
	}

	public void password(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnSignIn() {
		clickOnSignIn.click();
	}

	public String GetTitle() {
		return driver.getTitle();
	}
	
}
