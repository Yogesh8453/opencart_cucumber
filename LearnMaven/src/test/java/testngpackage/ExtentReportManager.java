package testngpackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener {

	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;

	public void onStart(ITestContext context) {

	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution started");
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myreport.html");
		sparkReporter.config().setDocumentTitle("Automation Result");
		sparkReporter.config().setReportName("Functional Testing");
		sparkReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Computer name", "Local Host");
	}

	public void onTestSuccess(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test case passed is:" + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is:" + result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test case skipped is:" + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
