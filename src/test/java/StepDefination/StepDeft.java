package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObject.Base;
import PageObject.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDeft extends Base {

	@Before("@kanha")
	public void setUp() {
		WebDriverManager.chromedriver().setup();

	}

	@Given("Open the Chrome Browser")
	public void open_the_chrome_browser() {
		driver = new ChromeDriver();
		loginPage = new LoginPage();

	}

	@When("Enter the URL {string}")
	public void enter_the_url(String url) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("Enter the Email as {string} and click on Next button")
	public void enter_the_email_as_and_click_on_next_button(String username) {
		loginPage.username(username);
		loginPage.clickOnNext();
	}
	
	@When("Enter the password as {string}")
	public void enter_the_password_as(String pass) {
	   loginPage.password(pass);
	}

	@When("Click on the Login Button")
	public void click_on_the_login_button() {
		loginPage.clickOnSignIn();
	}

	@Then("The title is displayed {string}")
	public void the_title_is_displayed(String expectedTitle) throws InterruptedException {
		System.out.println("This is the title ====="+loginPage.GetTitle());
		Thread.sleep(9000);
		String actualTitle = loginPage.GetTitle();
		if (actualTitle.equals(expectedTitle))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}

	@After
	public void TearDown() {
		driver.quit();
	}

}
