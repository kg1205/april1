package orangehrm.OrangeHrm;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listen implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"test started");
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println(result.getName()+"test success");
	}

	public void onStart(ITestContext context) {
		System.out.println(context.getName()+"on started");
	}

	public void onFinish(ITestContext context) {
	System.out.println(context.getName()+"on finished");
	}
	

}
