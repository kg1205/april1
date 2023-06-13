package orangehrm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Charges {

	public static WebDriver driver;

	public static void setproperty() {

		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('input'),value='ganeshkodimoju';");
	}

	public static void signin() throws Exception {

		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("login[username]")).sendKeys("gk@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("Ganesh@23");
		WebDriverWait w=new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("login[password]")));
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		System.out.println("sigin method is successfull with valid creditionals");
		System.out.println("valid creditionals are ");
		System.out.println("username: gk@gmail.com");
		System.out.println("password: gk@12345");
		
	}
	

	public static void order() throws Exception {
		Actions a=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[1]"))).build().perform();
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[2]/ul"))).build().perform();
		a.moveToElement(driver.findElement(By.id("ui-id-11"))).click().perform();
		String ss=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).getText();
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
	
		System.out.println(ss);
		WebElement s=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div/div[1]/div[1]/h1/span"));
		a.doubleClick(s).build().perform();
		
		driver.navigate().back();
		/*
		 * List<WebElement> w=new ArrayList<WebElement>(driver.findElements(By.xpath(
		 * "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol"))); for (WebElement q : w)
		 * { String st1=q.getText(); System.out.println();
		 */
		 String b = driver.findElement(By.xpath("//*[@id=\"layered-filter-block\"]/div[2]")).getText();
		 String[] s24=b.split("");
		
			List<WebElement> qq= new ArrayList<WebElement>(driver.findElements(By.id("narrow-by-list")));
			for(int i1=0;i1<qq.size();i1++) {
				
			}
		 

	}

	public static void main(String[] args) throws Exception {
		setproperty();
		signin();
		order();
	}
}





/*
 * Actions a = new Actions(driver); Thread.sleep(5000);
 * a.moveToElement(driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]")))
 * .build().perform();
 * a.moveToElement(driver.findElement(By.id("ui-id-10"))).perform();
 * a.moveToElement(driver.findElement(By.id("ui-id-16"))).click().perform();
 * Thread.sleep(2000); driver.findElement(By.xpath(
 * "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[2]/div/div/strong/a")).
 * click(); Thread.sleep(2000);
 * driver.findElement(By.id("option-label-size-143-item-172")).click();
 * driver.findElement(By.id("option-label-color-93-item-50")).click();
 * driver.findElement(By.id("product-addtocart-button")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).
 * click(); Thread.sleep(2000);
 * driver.findElement(By.id("top-cart-btn-checkout")).click();
 * Thread.sleep(10000); driver.findElement(By.xpath(
 * "//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
 * Thread.sleep(10000); String s1 = driver.findElement(By.xpath(
 * "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td")).getText();
 * System.out.println("the price of 1product" + s1); Thread.sleep(5000);
 * driver.navigate().back(); Thread.sleep(5000);
 * 
 * driver.navigate().back(); Thread.sleep(5000);
 * 
 * driver.navigate().back(); Thread.sleep(5000);
 * driver.findElement(By.id("option-label-size-143-item-172")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.id("option-label-color-93-item-50")).click();
 * driver.findElement(By.name("qty")).clear(); Thread.sleep(2000);
 * driver.findElement(By.name("qty")).sendKeys("2");
 * 
 * Thread.sleep(2000);
 * driver.findElement(By.id("product-addtocart-button")).click();
 * Thread.sleep(2000);
 * driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).
 * click(); Thread.sleep(2000);
 * driver.findElement(By.id("top-cart-btn-checkout")).click();
 * Thread.sleep(10000); driver.findElement(By.xpath(
 * "//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
 * Thread.sleep(10000); String s2 = driver.findElement(By.xpath(
 * "//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td")).getText();
 * 
 * System.out.println("the price after adding 2nd item in cart" + s2);
 */
