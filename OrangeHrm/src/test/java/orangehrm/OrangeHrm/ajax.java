package orangehrm.OrangeHrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ajax {

	public static WebDriver driver;
	
	public static void sys() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
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
