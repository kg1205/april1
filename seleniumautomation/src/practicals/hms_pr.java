package practicals;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hms_pr {
	public static WebDriver driver;
	public static void openurl() {
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
	}
	public static void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
	}
	public static void verify_registration() throws Exception{
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		Thread.sleep(1000);
		
	}
	public static void verify_details() {
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Self");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("ganesh");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("Voter ID");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\DELL\\Pictures\\Camera Roll\\IMAGE.jpg");
	}
	public static void verify_PopUp() throws Exception{
		driver.findElement(By.linkText("Feedback")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Object[] s = windows.toArray();
		driver.switchTo().window(s[1].toString());
		driver.findElement(By.id("name")).sendKeys("Ganesh");
		driver.findElement(By.id("email")).sendKeys("hgdfshkbjkdfshkjhf@gmail.com");
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Audi");
		driver.findElement(By.id("message")).sendKeys("gvdcbxcvhvkh");
		driver.close();
		driver.switchTo().window(s[0].toString());
		driver.findElement(By.name("ADDRESS1")).sendKeys("hjfbhdh");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("45454");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Logout")).click();
	}

	public static void main(String[] args) throws Exception{
		openurl();
		login();
		verify_registration();
		verify_details();
		verify_PopUp();
	}

}
