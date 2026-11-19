package com.MyWebTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D02TrialTestNGClass {
	@Test
	public void test1() {
		System.out.println("This is my test case");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is after test");
	}

}
