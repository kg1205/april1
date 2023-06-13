package com.luma.com.lumacart;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("on test start"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped"+result.getName());
	}

	public void onStart(ITestContext textcontext) {
		System.out.println("on  start"+textcontext.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("on  finish"+context.getName());
	}

	
}
