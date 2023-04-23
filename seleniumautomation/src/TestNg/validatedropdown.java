package TestNg;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class validatedropdown {
	public WebDriver driver;
  @Test
  public void f()throws Exception {
	 WebElement h=driver.findElement(By.id("reg_mothertongue"));
	 List<WebElement>d=h.findElements(By.tagName("option"));
	 System.out.println("no of values in dropdown:"+d.size());
	 for(int i=1;i<d.size();i++) {
		 System.out.println(d.get(i).getText());
		 Thread.sleep(1000);
	 }
	 for(int i=1;i<d.size();i++) {
		 if(d.get(i).getText().equalsIgnoreCase("TELUGU")) {
			 System.out.println(d.get(i).getText());
			 Thread.sleep(1000);
		 }
	 }
	 for(int i=1;i<d.size();i++) {
		 if(!d.get(i).getText().equalsIgnoreCase("TELUGU")) {
			 System.out.println(d.get(i).getText());
			 Thread.sleep(1000);
		 }
	 }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.eenadupellipandiri.net/");
	  driver.manage().window().maximize();
	  
  }

}
