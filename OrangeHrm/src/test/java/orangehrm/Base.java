package orangehrm.OrangeHrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriverr.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Login l = new Login();

		dmin d=new dmin();

		l.usnamee("Admin");
		l.pw("admin123");
		l.signin();
		d.admin();
		d.searchh("Sathish Kumar K");
		d.statuss();
	}
}
