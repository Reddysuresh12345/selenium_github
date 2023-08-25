package Listenerp;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.dom.ITagFactory;
import org.testng.xml.dom.ITagSetter;
import org.w3c.dom.Node;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplement implements ITestListener {
public static ExtentReports report;
public static ExtentTest logger;
public void onStart1(ITestContext context) 
{
	ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/selenium2.html");
	reporter.config().setDocumentTitle("sample report");
	reporter.config().setTheme(Theme.STANDARD);
	report=new ExtentReports();
	report.attachReporter(reporter);
	report.setSystemInfo("platform", "windows");
	report.setSystemInfo("platform", "mamatha");
}
	public void onTestStart(ITestResult result) {
	logger=report.createTest(result.getName());	
		
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "This test case"+result.getName()+"is sucess");
	}

	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "This test case"+result.getName()+"is failed");
		logger.addScreenCaptureFromPath("file:///C:/Section-II/suresh1/reports/selenium.html");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		this.report.flush();
	}

	
	
	}
	


