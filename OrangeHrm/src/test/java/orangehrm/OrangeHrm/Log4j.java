package orangehrm.OrangeHrm;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {
	Logger l=Logger.getLogger("Log4j");
	PropertyConfigurator.configure("log4j.properties");
	
	System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver_win32 (3)\\chromedriver.exe");
	l.info("property is set");
	WebDriver driver=new ChromeDriver();
	l.info("chromedriver opened");
	driver.get("https://www.google.com/");
	l.debug("google has opened");
	driver.manage().window().maximize();
	l.info("window maximized");
	
}
}