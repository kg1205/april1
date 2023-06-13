package orangehrm;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjaxHandling {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Logger logg= Logger.getLogger("ajax");
		PropertyConfigurator.configure("log4j.properties");
		logg.info("gettt");

		driver.findElement(By.name("q")).sendKeys("selenium");
		String links = driver.findElement(By.id("Alh6id")).getText();
		String[] s = links.split("\n");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equalsIgnoreCase("selenium webdriver")) {
				driver.findElement(By.name("q")).sendKeys(s[i]);
				
			}
		}
		driver.findElement(By.name("btnK")).click();
	}

}
