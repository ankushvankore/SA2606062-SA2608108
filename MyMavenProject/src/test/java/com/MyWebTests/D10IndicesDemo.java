package com.MyWebTests;

import org.testng.annotations.Test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class D10IndicesDemo {
	@Test(dataProvider = "dp")
	public void myTest(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);

		System.out.println("--------------------------");
	}

	@DataProvider (indices = {4, 3, 1})
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
			new Object[] { 3, "c" },
			new Object[] { 4, "d" },
			new Object[] { 5, "e" },
			new Object[] { 6, "f" },
		};
	}

	@AfterMethod
	public void afterMethod(ITestResult r) {
		//File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(file, new File("Path"));
	}
}
