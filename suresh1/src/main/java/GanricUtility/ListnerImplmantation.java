package GanricUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplmantation implements ITestListener {
	public static ExtentTest logger;
	public static ExtentReports report;
public void onStart(ITestListener context) {
	ExtentSparkReporter reportr=new ExtentSparkReporter("./reports/selenium.html");
	reportr.config().setDocumentTitle("advance project");
	reportr.config().setTheme(Theme.STANDARD);
	report=new ExtentReports();
	report.attachReporter(reportr);
	report.setSystemInfo("company", "qsp");
	report.setSystemInfo("platform", "windows");
	report.setSystemInfo("author", "suresh");
}
public void onTestStart(ITestResult result) {
	logger=report.createTest(result.getName());
}
public void onTestSuccess(ITestResult result) {
	logger.log(Status.PASS,"this test case"+result.getName()+"is successful");
}
public void onTestFailure(ITestResult result) {
	logger.log(Status.FAIL, "this test case"+result.getName()+"is failed");
	ScreenshotUtility utility=new ScreenshotUtility();
	logger.addScreenCaptureFromPath(utility.takeingScreenshot( result.getName()));
}
public void onFinish(ITestResult result) {
	report
}
}

