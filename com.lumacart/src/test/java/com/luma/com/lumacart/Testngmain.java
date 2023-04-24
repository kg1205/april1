package com.luma.com.lumacart;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testngmain {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void searchg() {
		P2 a = new P2(driver);
		a.search("seleniumbymahesh.com");
		a.searchbutton();
		a.clickonlink();
	}

	@Test(priority = 2)
	public void hms() {
		HmsPage h = new HmsPage(driver);
		h.clickonhms();
		h.loginpage("admin");
		h.loginpass("admin");
		h.click();
	}
	@Test(priority = 3)
	public void registerpage() {
		Registerhms r=new Registerhms(driver);
		r.registerclick();
		r.selct1();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct2();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct3();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct4();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct5();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct6();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct7();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct8();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct9();
		r.selct005();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct10();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct11();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct12();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct13();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct14();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.firstname("ganesh");
		r.lastname("gani");
		r.aadharcard("213216541");
		r.dateob("12-05-1998");
		r.age("25");
		r.address("sr nagar");
		r.phone("8555555114");
		r.pincode("502222");
		r.image();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		r.selct15();
		r.submit();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
	}

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
