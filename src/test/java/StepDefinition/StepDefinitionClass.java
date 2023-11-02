package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitionClass {
	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// allocating memory to LoginPage
		lp = new LoginPage(driver);

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String emailAdd, String passAdd) {
		lp.enterEmail(emailAdd);
		lp.enterPassword(passAdd);
	}

	@When("click on Login")
	public void click_on_login() {
		lp.clickLogin();
	}
	//LOGIN FEATURE//
	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			Assert.assertTrue(true); //pass
		}
		else
		{
			Assert.assertTrue(false); //fail
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() {
		lp.clickLogout();
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		driver.quit();
	}

}
