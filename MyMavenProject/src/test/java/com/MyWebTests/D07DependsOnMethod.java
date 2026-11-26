package com.MyWebTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependsOnMethod {
	@Test(priority = 1)
	public void login() {
		System.out.println("This is login test");
		Assert.assertTrue(false);
	}

	@Test(priority = 2, dependsOnMethods = "login")
	public void logout() {
		System.out.println("This is logout test");
	}
}
