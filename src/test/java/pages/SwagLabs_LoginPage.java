package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_LoginPage{
	WebDriver driver;
	By username = By.id("user-name");
	By password = By.id("password");
	By login_btn = By.id("login-button");
	By container = By.id("inventory_container");
	
	public SwagLabs_LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void user_enter_password_username(String username, String password) {
		driver.findElement(this.username).sendKeys(username);
		driver.findElement(this.password).sendKeys(password);
	}
	
	public void press_btn() {
		driver.findElement(login_btn).click();
	}
	
	public Boolean user_is_navigated_to_market() {
		return driver.findElement(container).isDisplayed();
	}
}
