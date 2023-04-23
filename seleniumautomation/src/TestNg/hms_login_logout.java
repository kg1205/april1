package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class hms_login_logout {
	public WebDriver driver;

	@Test(priority = 0)
	public void verifylogin() {
		driver.findElement(By.linkText("HMS")).click();
		WebElement ax = driver.findElement(By.xpath("//input[@name='username']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='ganesh';", ax);
		js.executeScript("document.getElementsByName('submit')[0].click()");
	}

	@Test(enabled = false)
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumbymahesh.com");
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}

/**
 * driver.findElement(By.linkText("HMS")).click();
 * driver.findElement(By.name("username")).sendKeys("admin");
 * driver.findElement(By.name("password")).sendKeys("admin");
 * driver.findElement(By.name("submit")).click();
 */