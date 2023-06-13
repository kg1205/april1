package orangehrm;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class list {
	public WebDriver driver;
	public Logger logg;
	

	@BeforeTest

	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		logg=Logger.getLogger("list");
		PropertyConfigurator.configure("log4j.properties");
		
		
	}

	@Test

	public void test() throws Exception {

		List<WebElement> l = driver.findElements(By.xpath("//div[@class='L3eUgb']"));
		
		DateFormat dtformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < l.size(); i++) {
			System.err.println(l.get(i).getText());
		}
		logg.info("test has in progress");

		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File f2 = new File("D:\\library\\" +dtformat+".png");
		FileUtils.copyFile(f1, f2);
	}

	@AfterTest

	public void close() {
		driver.quit();
		logg.info("test has closed");
	}
}
