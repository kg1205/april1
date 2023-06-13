package lumafine;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listen implements ITestListener {
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest logger;

	/*
	 * WebDriver driver;
	 * 
	 * public listen(WebDriver d) { this.driver=d; }
	 * 
	 * 
	 * public void onTestFailure(ITestResult result) {
	 * System.out.println("passed ganeshhh test"); Date dt = new Date(); DateFormat
	 * dtfrmt = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss"); String path =
	 * System.getProperty("/.screenshots"); File f = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(f, new
	 * File(path + "gani.png")); } catch (IOException e) { // TODO Auto-generated
	 * e.printStackTrace(); } }
	 * 
	 * public void onTestSuccess(ITestResult result) {
	 * System.out.println("passed ganeshhh test"); Date dt = new Date(); DateFormat
	 * dtfrmt = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss"); String path =
	 * System.getProperty("/.screenshots"); File f = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.FILE); try { FileUtils.copyFile(f, new
	 * File(path + "/screen/" + "gani.png")); } catch (IOException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 */
	public void onTestSuccess(ITestResult result) {
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
	//htmlreporter.config().setTestViewChartLocation(ChartLocation.TOP);
	htmlreporter.config().setTheme(Theme.DARK);
}}
