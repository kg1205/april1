package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlelinks {
	public WebDriver driver;
	
	public void openurl() {
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
	}
	public void clicklinks(String str)throws Exception {
		driver.findElement(By.xpath(str)).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("English")).click();
		
	}

	public static void main(String[] args) throws Exception{
		Googlelinks G=new Googlelinks();
		G.openurl();
		G.clicklinks("//div[@id='SIvCob']/a[1]");
		G.clicklinks("//div[@id='SIvCob']/a[2]");
		G.clicklinks("//div[@id='SIvCob']/a[3]");
		G.clicklinks("//div[@id='SIvCob']/a[4]");

	}

}
