package com.luma.com.lumacart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registerhms {

	WebDriver driver;

	public Registerhms(WebDriver d) {
		driver = d;
	}

	By registclick = By.linkText("Registration");
	By frstname = By.name("PNT_NAME");
	By lstname = By.name("LAST_NAME");
	By aadhar=By.name("PAT_IDENTITY_PROOF");
	By dob = By.name("DOB");
	By agebox = By.name("AGE");
	By addres=By.name("ADDRESS1");
	By mobile=By.name("MOBILE_NO");
	By zip=By.name("ZIP");
	By button=By.name("submit");
	

	public void registerclick() {
		driver.findElement(registclick).click();
	}

	public void selct1() {
		Select s = new Select(driver.findElement(By.name("PATIENT_CAT")));
		s.selectByIndex(1);

	}

	public void selct2() {
		Select s = new Select(driver.findElement(By.name("RELATION")));
		s.selectByIndex(1);
	}

	public void selct3() {
		Select s = new Select(driver.findElement(By.name("TITLE")));
		s.selectByIndex(1);
	}

	public void firstname(String name) {
		driver.findElement(frstname).sendKeys(name);
	}

	public void selct4() {
		Select s = new Select(driver.findElement(By.name("PAT_IDENTITY")));
		s.selectByIndex(1);
	}

	public void lastname(String name) {
		driver.findElement(lstname).sendKeys(name);
	}
	public void aadharcard(String name) {
		driver.findElement(aadhar).sendKeys(name);
	}

	public void dateob(String name) {
		driver.findElement(dob).sendKeys(name);
	}

	public void age(String name) {
		driver.findElement(agebox).sendKeys(name);
	}

	public void selct5() {
		Select s = new Select(driver.findElement(By.name("NATIONALITY")));
		s.selectByIndex(1);
	}

	public void selct6() {
		Select s = new Select(driver.findElement(By.name("IS_MLC")));
		s.selectByIndex(1);
	}

	public void selct7() {
		Select s = new Select(driver.findElement(By.name("EDUCATION")));
		s.selectByIndex(1);
	}

	public void selct005() {
		Select s = new Select(driver.findElement(By.name("BLOOD_GRP_CODE")));
		s.selectByIndex(1);
	}

	public void selct8() {
		Select s = new Select(driver.findElement(By.name("SEX")));
		s.selectByIndex(1);
	}

	public void selct9() {
		Select s = new Select(driver.findElement(By.name("OCCUPATION")));
		s.selectByIndex(1);
	}

	public void selct10() {
		Select s = new Select(driver.findElement(By.name("MTRL_STATUS")));
		s.selectByIndex(1);
	}

	public void selct11() {
		Select s = new Select(driver.findElement(By.name("RELIGION")));
		s.selectByIndex(1);
	}

	public void selct12() {
		Select s = new Select(driver.findElement(By.name("PLANGUAGE")));
		s.selectByIndex(1);
	}

	public void selct13() {
		Select s = new Select(driver.findElement(By.name("CITIZENSHIP")));
		s.selectByIndex(2);
	}

	public void selct14() {
		Select s = new Select(driver.findElement(By.name("SC_PROOF")));
		s.selectByIndex(1);
	}
	public void address(String name) {
		driver.findElement(addres).sendKeys(name);
	}
	public void phone(String name) {
		driver.findElement(mobile).sendKeys(name);
	}
	public void pincode(String name) {
		driver.findElement(zip).sendKeys(name);
	}
	public void selct15() {
		Select s = new Select(driver.findElement(By.name("COUNTRY_CODE")));
		s.selectByIndex(1);
	}
	public void image() {
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\DELL\\Downloads\\IMAGE.png");
	}
	public void submit() {
		driver.findElement(button).click();
	}
	
}
