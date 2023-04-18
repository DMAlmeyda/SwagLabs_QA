package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Connection {
	WebDriver driver;
	
	public WebDriver chromeDriverConnection(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dieguillo\\Desktop\\Api testing\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	
}
