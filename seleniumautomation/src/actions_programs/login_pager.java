package actions_programs;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class login_pager {
	public WebDriver driver;

	@Test
	public void valid_ones() throws Exception {
		String s1[] = { "admin", "manesh", "suresh", "naresh", "mahesh" };
		String s2[] = { "admin", "ganesh", "hushh", "push", "rush", "kush" };
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals("admin")) {
					if (s2[i].equals("admin")) {
						driver.findElement(By.name("username")).sendKeys(s1[i]);
						driver.findElement(By.name("password")).sendKeys(s2[i]);
						driver.findElement(By.name("submit")).click();
						driver.findElement(By.linkText("Logout")).click();
						Thread.sleep(5000);

						System.out.println("login done with valid vreditionals" +"\n"+ s1[i]+ "\n" + s2[i]);
						break;

					}
					else {
						
					}

				}
			}
		}

	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\library\\chromedriver_win32\\chromedriver.exe\\");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().window().maximize();

	}

}
