package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax {

	public static WebDriver driver;
	
	public static void sys() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir"));
		driver = new ChromeDriver();
		driver.get("https://github.com/kg1205/april1");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	}
	public static void ajax() {
		String str=driver.findElement(By.xpath("//div[@class='erkvQe']")).getText();
		String[]ss=str.split("");
		for(int i=0;i<ss.length;i++) {
			System.out.println(ss[i]);
		}
	}
	
	public static void main(String[] args) {
		sys();
		ajax();
		
	}

	
}
