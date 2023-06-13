package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		String links = driver.findElement(By.id("Alh6id")).getText();
		String[] s = links.split("\n");

		for (int i = 0; i < s.length; i++) {
			if (s[i].equalsIgnoreCase("seleniumbymahesh")) {
				driver.findElement(By.name("q")).sendKeys(s[i]);
				driver.findElement(By.name("btnK")).click();
			}
		}
	}

}
