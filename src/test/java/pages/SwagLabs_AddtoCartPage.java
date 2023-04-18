package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_AddtoCartPage{
	By backpack_id = By.id("add-to-cart-sauce-labs-backpack");
	By bikelight_id = By.id("add-to-cart-sauce-labs-bike-light");
	By tshirt_id = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By cart_id = By.id("shopping_cart_container");
	By username = By.id("user-name");
	By password = By.id("password");
	By login_btn = By.id("login-button");
	WebDriver driver;
	public SwagLabs_AddtoCartPage(WebDriver driver) {
		this.driver = driver;
	}
	public void userLogin() throws InterruptedException {
		driver.findElement(this.username).sendKeys("standard_user");
		driver.findElement(this.password).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(login_btn).click();
	}
	
	public void BuyProduct1() {
		driver.findElement(backpack_id).click();
	}
	
	public void BuyProduct2() {
		driver.findElement(bikelight_id).click();
	}
	public void BuyProduct3() {
		driver.findElement(tshirt_id).click();
	}
	
	public void Gototheshopingcart() throws InterruptedException {
		driver.findElement(cart_id).click();
		Thread.sleep(2000);
	}
	
	public String[] validate_product_names() {
		List<WebElement> guardar = driver.findElements(By.className("inventory_item_name"));
		String[] datos = new String[5];
		int i = 0;
		for(WebElement a : guardar) {
			datos[i] = a.getText();
			i+=1;		
		}
		return datos;
	}
}
