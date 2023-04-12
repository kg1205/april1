package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	public static WebDriver driver;
	public static void openURL() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://facebook.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public static void verifyLogin() {
		driver.findElement(By.name("email")).sendKeys("mahesh");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.name("login")).click();
	}
	
		public static void main(String[] args) throws Exception {
			openURL();
			verifyLogin();
	}

}
