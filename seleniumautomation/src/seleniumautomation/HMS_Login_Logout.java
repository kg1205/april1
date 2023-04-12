package seleniumautomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HMS_Login_Logout {
	public static WebDriver driver;
	public static void openURL(){
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		driver=new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
	public static void verifyLogin()throws Exception{
		driver.findElement(By.linkText("HMS")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('submit')[0].click();");
		/*
		 * driver.findElement(By.linkText("HMS")).click();
		 * driver.findElement(By.name("username")).sendKeys("admin");
		 * driver.findElement(By.name("password")).sendKeys("admin");
		 * //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); //both are
		 * same statements //driver.manage().timeouts().pageLoadTimeout(25,
		 * TimeUnit.SECONDS); WebDriverWait w=new
		 * WebDriverWait(driver,Duration.ofSeconds(10)); WebElement s =
		 * driver.findElement(By.name("submit"));
		 * w.until(ExpectedConditions.elementToBeClickable(s)).click();
		 */
		
		
	}
	public static void verifyLogout()throws Exception{
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
	}
	public static void main(String[] args)throws Exception {
		openURL();
		verifyLogin();
		//verifyLogout();
	}

}
