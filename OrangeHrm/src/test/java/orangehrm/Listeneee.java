package orangehrm;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeneee implements ITestListener {
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;

	public void onTestSuccess(ITestResult result) {

		// @SuppressWarnings("deprecation")
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date(0));
		String repname = "Test-report-" + timestamp + ".html";
		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + repname);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-configuu.xml");

		extent = new ExtentReports();

		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("environment", "qa");
		extent.setSystemInfo("user", "ganesh");

		htmlreporter.config().setDocumentTitle("lumacartautomation");
		htmlreporter.config().setReportName("testing");
		// htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlreporter.config().setTheme(Theme.DARK);

	}
}