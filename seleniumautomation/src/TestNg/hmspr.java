package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class hmspr {
	public WebDriver driver;
  @Test(priority=0)
  public void verifylogin() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
  }
  @Test(priority=1)
	  public void verifyregistration() {
	  	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Registration")).click();
		  driver.findElement(By.linkText("Perminent Registration")).click();
	  }
	  @Test(priority=2)
		  public void verifypr() throws Exception {
		  WebDriverWait s=new WebDriverWait(driver, Duration.ofSeconds(10));
		  s.until(ExpectedConditions.presenceOfElementLocated(By.name("PATIENT_CAT")));
		  driver.findElement(By.name("PATIENT_CAT")).sendKeys("Self");
		  driver.findElement(By.name("RELATION")).sendKeys("Brother");
		  driver.findElement(By.name("TITLE")).sendKeys("Mr");
		  driver.findElement(By.name("PNT_NAME")).sendKeys("suresh");
		  driver.findElement(By.name("PAT_IDENTITY")).sendKeys("AAdhar Card");
		  driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("1236454545");
		  driver.findElement(By.name("LAST_NAME")).sendKeys("mahesh");
		  driver.findElement(By.name("DOB")).sendKeys("23-08-2022");
		  driver.findElement(By.name("NATIONALITY")).sendKeys("Indian");
		  driver.findElement(By.name("AGE")).sendKeys("21");
		  driver.findElement(By.name("IS_MLC")).sendKeys("yes");
		  driver.findElement(By.name("SEX")).sendKeys("Male");
		  driver.findElement(By.name("EDUCATION")).sendKeys("B.Tech");
		  driver.findElement(By.name("MTRL_STATUS")).sendKeys("Single");
	      driver.findElement(By.name("OCCUPATION")).sendKeys("Self Employed");
	      driver.findElement(By.name("RELIGION")).sendKeys("Hindu");
	      driver.findElement(By.name("BLOOD_GRP_CODE")).sendKeys("A-");
	      driver.findElement(By.name("PLANGUAGE")).sendKeys("Telugu");
	      driver.findElement(By.name("CITIZENSHIP")).sendKeys("Indian");
	      driver.findElement(By.name("SC_PROOF")).sendKeys("No");
	      driver.findElement(By.name("ADDRESS1")).sendKeys("HYD");
	      driver.findElement(By.name("MOBILE_NO")).sendKeys("9234569874");
	      driver.findElement(By.name("COUNTRY_CODE")).sendKeys("India");
	      driver.findElement(By.name("ZIP")).sendKeys("500255");
	      driver.findElement(By.name("image")).sendKeys("E:\\movies\\IMAGE.jpeg");
	      driver.findElement(By.name("submit")).click();
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }
	  @Test(priority=3)
	  public void verifyalerts() {
		  WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(5));
		  w.until(ExpectedConditions.alertIsPresent()).accept();
		  //WebElement st = (WebElement) driver.switchTo().alert();
		 
			/*
			 * String str=driver.switchTo().alert().getText(); System.out.println(str);
			 */
		  
	  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
	  driver=new ChromeDriver();
	  driver.get("http://seleniumbymahesh.com//HMS");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.findElement(By.linkText("Logout")).click();
  }

}
