package practicals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class softasser {
	public WebDriver driver;
  @Test
  public void login() {
	  driver.findElement(By.name("email")).sendKeys("jjj");
	  driver.findElement(By.id("loginbutton")).click();
	  
	  SoftAssert s=new SoftAssert();
	  
	  String exp = driver.getTitle();
	  String actu="Log in to Facebook";
	  s.assertEquals(exp,actu);
	  
	  
	  String act_url = driver.getCurrentUrl();
	  String exp_url= "https://www.facebook.com/login/device-basedregular/login/?login_attempt=1&lwv=1000";
	  s.assertEquals(exp_url, act_url);
	  
	  String actu_border = driver.findElement(By.name("email")).getCssValue("border");
	  String exp_border="1px solid rgb(240, 40, 73)";
	  s.assertEquals(exp_border,actu_border);
	  
	  String exp_text = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
	  String actu_text="The email address or mobile number you entered isn't connected to an account. Create a new Facebook account.";
	  s.assertEquals(exp_text, actu_text);
	  
	  driver.quit();
	  s.assertAll();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/login.php");
	  driver.manage().window().maximize();
	  
  }
  

}
