package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hmspr {
	public static WebDriver driver;
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("seleniumbymahesh.com/hms");
		driver.manage().window().maximize();
	}
	public static void verifyLogin() {
		driver.findElement(By.name("username")).sendKeys("admin");;
		driver.findElement(By.name("password")).sendKeys("admin");;
		driver.findElement(By.name("submit")).click();
	}
	

	public static void main(String[] args) {

	}

}
