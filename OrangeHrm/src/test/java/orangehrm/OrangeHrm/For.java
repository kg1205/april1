package orangehrm.OrangeHrm;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class For {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");

		// driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); //both are
		// same statements //driver.manage().timeouts().pageLoadTimeout(25,
		// TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, 10);
		WebElement s = driver.findElement(By.name("submit"));
		w.until(ExpectedConditions.elementToBeClickable(s)).click();
		driver.findElement(By.linkText("Feedback")).click();
		Set<String> ss=driver.getWindowHandles();
		

	}

}
