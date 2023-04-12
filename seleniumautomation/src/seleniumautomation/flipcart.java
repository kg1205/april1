package seleniumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {
	public static WebDriver driver;
	public static void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
	}
	public static void verifylogin() {
		driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
		driver.findElement(By.xpath("//div.a[@class='_1_3w1N']")).click();
		driver.findElement(By.xpath("//div.input[@class='_2IX_2-.VJZDxU']")).sendKeys("ganeshkodimoju52@gmail.com");
		driver.findElement(By.xpath("//div.input[@class='_2IX_2-._3mctLh.VJZDxU']")).sendKeys("Ganesh@23");
		driver.findElement(By.xpath("//div[@class='_2KpZ6l._2HKlqd._3AWRsL']")).click();
	}

	public static void main(String[] args) {
		openurl();
		verifylogin();
		

	}

}
