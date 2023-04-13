package test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwagLabs_LoginPage;
public class SwagLabs_LoginPageTest {
	WebDriver driver;
	SwagLabs_LoginPage sl_loginpage;

	@Given("user open browser")
	public void user_open_browser() {
		this.sl_loginpage = new SwagLabs_LoginPage();
		driver = this.sl_loginpage.Connection();
	}

	@And("enter into the website")
	public void enter_into_the_website() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_standard_user_and_secret_sauce(String username, String passsword){
		this.sl_loginpage.user_enter_password_username(username, passsword);
	}

	@And("press button Login")
	public void press_button() {
		this.sl_loginpage.press_btn();
	}

	@Then("is navigated to the website market")
	public void is_navigated_to_the_website_market() throws InterruptedException {
		assertEquals(true, this.sl_loginpage.user_is_navigated_to_market());
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
