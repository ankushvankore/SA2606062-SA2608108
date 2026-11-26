package com.MyWebTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

@Listeners(com.MyWebTests.MyListnerClass.class)
public class D06ForListner {
	@Test
	public void test1() {
		System.out.println("This is test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("This is test2");
		Assert.assertTrue(false);
	}

	@Test
	public void test3() {
		System.out.println("This is test3");
		throw new SkipException("I am skipping this test case for testing purpose...");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test...");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test...");
	}

}
