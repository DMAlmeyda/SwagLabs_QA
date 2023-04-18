package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

public class SwagLabs_ConfirmPurchaseTest {
	WebDriver driver;
	SwagLabs_AddtoCartPage additem;
	SwagLabs_LoginPage login;
	SwagLabs_ConfirmPurchase confirm_purchase;
	Connection cn;
	@Given("user open browser..")
	public void user_open_browser() {
		cn = new Connection();
		driver = cn.chromeDriverConnection(driver);		
		this.additem = new SwagLabs_AddtoCartPage(driver);
		this.login = new SwagLabs_LoginPage(driver);
		this.confirm_purchase = new SwagLabs_ConfirmPurchase(driver);
		driver.navigate().to("https://www.saucedemo.com/");
	}

	@And("login into the website")
	public void login_into_the_website() {
	    this.login.user_enter_password_username("standard_user", "secret_sauce");
	    this.login.press_btn();;
	}

	@And("buy some items")
	public void buy_some_items() {
		this.additem.BuyProduct1();
		this.additem.BuyProduct2();
	}

	@And("user goes to the shoping cart")
	public void user_goes_to_the_shoping_cart() throws InterruptedException {
		this.additem.Gototheshopingcart();
	}

	@When("user click checkout button")
	public void user_click_checkout_button() throws InterruptedException {
		this.confirm_purchase.clickbtncheckout();
	}

	@And("^user type (.*), (.*) and (.*)$")
	public void user_types_his_name1_surname1_and(String name, String surname, String postal_code) throws InterruptedException {
		this.confirm_purchase.fillfields(name, surname, postal_code);
	}

	@And("click continue button")
	public void press_continue_button() throws InterruptedException{
		this.confirm_purchase.clickContinuebtn();
	}

	@Then("user is available to see the total price")
	public void user_is_available_to_see_the_total_price() throws InterruptedException {
		assertEquals(true,this.confirm_purchase.totalprice());
	}

	@And("click the final button, the purchase will be done and the programm will say Thank you for your order!")
	public void click_the_final_button_the_purchase_will_be_done_and_the_programm_will_say_thank_you_for_your_order() throws InterruptedException {
		this.confirm_purchase.clickfinisth();
		this.confirm_purchase.purchaseconfirm();
		assertEquals(true, this.confirm_purchase.purchaseconfirm());
		driver.close();
		driver.quit();
	}
}
