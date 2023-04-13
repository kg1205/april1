package actions_programs;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Actions_1 implements ITestListener {
	

	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("HMS"))).click().perform();
		
		String s1 = "ad";
		String s2 = "min";
		String str = s1.concat(s2);
		System.out.println(str);
		int n = str.length();
		System.out.println(n);
		driver.findElement(By.name("username")).sendKeys(str);
		driver.findElement(By.name("password")).sendKeys("admin");

		a.click(driver.findElement(By.name("submit"))).perform();

		a.click(driver.findElement(By.linkText("Registration"))).perform();
		String str1 = "Ganesh";
		driver.findElement(By.name("PNT_NAME")).sendKeys(str1);
		char ch = str1.charAt(4);
		System.out.println(ch);

		a.doubleClick(driver.findElement(By.name("PNT_NAME"))).perform();
		String str2 = "ganesh";

		driver.findElement(By.name("LAST_NAME")).sendKeys(str2);

		int m = str1.compareTo(str2);
		System.out.println(m);

		WebElement ss = driver.findElement(By.linkText("Registration"));
		/*
		 * WebElement e = new RemoteWebElement(); e.findElement(By.xpath(str2));
		 */
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		  //int d=20;
		  
		  
		 
	
		final int TIMEOUT = 10;
		WebDriverWait www=new WebDriverWait(driver, Duration.ofSeconds(TimeUnit.SECONDS.toSeconds(TIMEOUT)));
		  www.until(ExpectedConditions.visibilityOf(ss)).click();
		

//		www.until(ExpectedConditions.elementToBeClickable(By.xpath(str2)));
		/*//equals method
		 * boolean b=str1.equals(str2); System.out.println(b);
		 * 
		 //equalsignorecase
		 // boolean c=str1.equalsIgnoreCase(str2); System.out.println(c);
		 
		 //if condition equals method
		/*
		 * if(str1.equals(str2)) { System.out.println("both equal"); } else {
		 * System.out.println("not equal"); }
		 */
		 //if condition equals ignore case method
		 
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("both equal");
		} 
		else {
			System.out.println("not equal");
		}
		
	/*	//replace method
		String stre="house";
		String sr=stre.replace("h", "g");
		driver.findElement(By.name("ADDRESS1")).sendKeys(sr);
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('content').value='ksdbnd';");

	}
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}*/}
}
