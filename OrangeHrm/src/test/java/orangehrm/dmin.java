package orangehrm;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dmin {
	public static WebDriver driver;
	Logger l=Logger.getLogger(dmin.class);
	
	
	public void adminpage(WebDriver driver) {
		dmin.driver=driver;
	}
	By adminf=By.xpath("//a[@class='oxd-main-menu-item active']");
	By search=By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
	By status =By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[position()=2]");

	
	
	public void admin() {
		driver.findElement(adminf).click();
		l.debug("admin sendkeys has done");
	}
	public void searchh(String name) {
		driver.findElement(search).sendKeys(name);
		l.info("search has clicked");
		
	}
	public void statuss() {
		driver.findElement(status).click();
	}
}