package actions_programs;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.internal.Utils;

import io.netty.handler.codec.http.multipart.FileUpload;

public class For_interview {

	public static WebDriver driver;

	public static void openurl() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();
		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f2=new File("D:\\library\\dsfhjsn.png");
		
	}

	public static void sign() throws Exception {
		
		for(int i=0;i<3;i++) {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		Thread.sleep(2000);
		System.out.println("logout done");
		}
		
	}

	public static void main(String[] args) throws Exception {
		openurl();
		sign();
	}

}
