package practicals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login_logout {
	public WebDriver driver;
	public void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
	}
	public void verify_login() throws Exception{
		driver.findElement(By.name("identifier")).sendKeys("ganeshkodimoju52@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Premala@98");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	public static void main(String[] args) throws Exception {
		Gmail_login_logout g=new Gmail_login_logout();
		g.openurl();
		g.verify_login();
		

	}

}
