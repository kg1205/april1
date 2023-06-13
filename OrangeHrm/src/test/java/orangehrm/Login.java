package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	public static WebDriver driver;
	
	
	public void login(WebDriver driver){
		Login.driver=driver;
	}

	By usname=By.name("username");
	By passw=By.name("password");
	By loginf=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
	
	public void usnamee(String uname) {
		driver.findElement(usname).sendKeys(uname);
		
	}
	public void pw(String pwn) {
		driver.findElement(passw).sendKeys(pwn);
	}
	public void signin() {
		driver.findElement(loginf).click();
	}
	
	
}
