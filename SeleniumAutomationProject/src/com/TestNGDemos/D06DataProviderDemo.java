package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataProviderDemo {
	
	//This test case will fetch the data from @DataProvider which having name dp
	@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println(n);
		System.out.println(s);
		System.out.println("------------------");
	}
	
	//this method will pass the data to test case
	@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 101, "Sumit" },
			new Object[] { 102, "Puja" },
			new Object[] { 103, "Saritha" },
		};
	}
	
	@AfterMethod
	public void afterMethod() {
	}

	
	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
