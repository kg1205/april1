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

	@AfterTest
	public void afterTest() {
		// driver.quit();
	}

}
