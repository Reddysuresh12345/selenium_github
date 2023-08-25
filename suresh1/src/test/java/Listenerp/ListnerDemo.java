package Listenerp;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerDemo  implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("on Test Start "+result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on Test Success "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on Test failure "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on Test Skipped "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("on Test  "+result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("on Test start "+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("on Test finish "+context.getName());
		
	}

}