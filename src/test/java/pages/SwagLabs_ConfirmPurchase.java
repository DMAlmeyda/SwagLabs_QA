package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabs_ConfirmPurchase{
	By checkoutbtn = By.id("checkout");
	By first_name = By.id("first-name");
	By last_name = By.id("last-name");
	By postal_code = By.id("postal-code");
	By continuebtn = By.id("continue");
	By price_total = By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]");
	By finishbtn = By.id("finish");
	By purchaseconfirm = By.id("checkout_complete_container");
	WebDriver driver;
	public SwagLabs_ConfirmPurchase(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void clickbtncheckout() throws InterruptedException {
		driver.findElement(checkoutbtn).click();;
	}
	
	public void fillfields(String name, String surname, String postalcode)  throws InterruptedException{
		driver.findElement(first_name).sendKeys(name);
		driver.findElement(last_name).sendKeys(surname);
		driver.findElement(postal_code).sendKeys(postalcode);
		Thread.sleep(2000);
	}
	
	public void clickContinuebtn()  throws InterruptedException{
		driver.findElement(continuebtn).click();
	}
	
	public Boolean totalprice()  throws InterruptedException{
		return driver.findElement(price_total).isDisplayed();
		
	}
	
	public void clickfinisth() {
		driver.findElement(finishbtn).click();
	}
	
	public Boolean purchaseconfirm()  throws InterruptedException{
		return driver.findElement(purchaseconfirm).isDisplayed();
	
	}
	
	
}
