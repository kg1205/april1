package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hmsloginlogout {
	public static WebDriver driver;
	public static void openURL() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
	public static void verifylogin() throws Exception{
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();	
	}
	public static void verifylogout() throws Exception{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
	}

	public static void main(String[] args) throws Exception{
		openURL();
		verifylogin();
		verifylogout();
	}

}
