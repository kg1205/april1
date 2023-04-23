package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class flipcart {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.name("q")).sendKeys("flipcart.com");
	  driver.findElement(By.name("btnK")).click();
	  driver.findElement(By.cssSelector("h3.LC20lb.MBeuO.DKV0Md")).click();
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
