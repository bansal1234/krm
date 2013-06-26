package com.snapdeal.test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(context);
	}

}

