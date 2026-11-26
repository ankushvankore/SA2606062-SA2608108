package com.MyWebTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListnerClass implements ITestListener {
	public void onStart(ITestContext result) {
		System.out.println("Test started...");
	}

	public void onFinish(ITestContext result) {
		System.out.println("All tests finished...");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + " failed...");

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + " skipped...");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Starting execution of : " + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + " pass...");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}
}
