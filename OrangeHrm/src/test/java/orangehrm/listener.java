package orangehrm.OrangeHrm;

import org.testng.annotations.Test;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
@Listeners(listen.class)
public class listener {
	public WebDriver driver;
  @Test
  public void test1() {
	  driver.findElement(By.name("q")).sendKeys("virat kohli");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.name("btnK")).click();
	  String s=driver.findElement(By.xpath("//span[@class='yKMVIe']")).getText();
	  String expectd_result = "Virat Kohli";
	  String actual_result = s;
	  Assert.assertEquals(expectd_result, actual_result);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
  }

}
