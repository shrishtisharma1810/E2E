package com.mycompany.app;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerEx implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("On Test Start: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On Test Success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Test Failure: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On Test Failed But Within Success Percentage: "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On Test Failed With Timeout: "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start: ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish: ");
	}

}
