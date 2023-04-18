package test;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Connection;
import pages.SwagLabs_AddtoCartPage;
public class SwagLabs_AddtoCartPageTest {
	WebDriver driver;
	Connection cn;
	SwagLabs_AddtoCartPage adc;
	@Given("user open the browser")
	public void user_open_the_browser() {
		cn = new Connection();
	    driver = cn.chromeDriverConnection(driver);
	    adc = new SwagLabs_AddtoCartPage(driver);
	}
	
	@And("user goes to the website")
	public void user_goes_to_the_website() {
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@And("user log in into the website")
	public void user_log_in_into_the_website() throws InterruptedException {
	    adc.userLogin();
	}

	@When("user click the button Add to cart")
	public void user_click_the_button_add_to_cart() {
	    adc.BuyProduct1();
	    adc.BuyProduct2();
	    adc.BuyProduct3();
	}

	@Then("the product is shown in the shopping cart")
	public void the_product_is_shown_in_the_shopping_cart() throws InterruptedException {
	    String[] productnames = null;
	    adc.Gototheshopingcart();
	    productnames = adc.validate_product_names();
	    Thread.sleep(2000);
	    assertEquals("Sauce Labs Backpack", productnames[0]);
	    assertEquals("Sauce Labs Bike Light", productnames[1]);
	    assertEquals("Sauce Labs Bolt T-Shirt", productnames[2]);
	    driver.close();
		driver.quit();
	}
}
