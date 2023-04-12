package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcartlogin {
	public static WebDriver driver;
	public static void openURL() {
	System.setProperty("webdriver.chrome.driver","D:\\library\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.manage().window().maximize();
	}
	public static void loginflipcart() {
		driver.findElement(By.id("input")).sendKeys("flipcart");
		
	}

	public static void main(String[] args) {
		openURL();
		loginflipcart();

	}

}
