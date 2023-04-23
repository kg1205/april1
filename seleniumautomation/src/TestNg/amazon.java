package TestNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class amazon {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme gt master");
	  driver.findElement(By.xpath("div.[@class='nav-input']")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("amazon.com");
	  driver.manage().window().maximize();
  }

}
