package org.qsptestngdemo.org;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getStartDate() + "SC");
		System.out.println(context.getAllTestMethods() + "SC");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate() + "FC");
		System.out.println(context.getPassedTests() + "FC");
		System.out.println(context.getFailedTests() + "FC");
		System.out.println(context.getSkippedTests() + "FC");

	}

}
