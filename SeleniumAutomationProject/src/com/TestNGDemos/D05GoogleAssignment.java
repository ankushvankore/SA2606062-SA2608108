package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05GoogleAssignment {
	WebDriver driver;

	@Test (priority = 1, groups = "HeaderLinks")
	public void testAboutLink() {
		driver.findElement(By.linkText("About")).click();
		Assert.assertTrue(driver.getTitle().contains("About Google"));
	}
	
	@Test (priority = 2, groups = "HeaderLinks")
	public void testStoreLink() {
		driver.findElement(By.linkText("Store")).click();
		Assert.assertTrue(driver.getTitle().contains("Google Store"));
	}
	
	@Test (priority = 3, groups = "FooterLinks")
	public void testAdvtLink() {
		driver.findElement(By.partialLinkText("Adve")).click();
		Assert.assertTrue(driver.getTitle().contains("Reach Customers"));
	}
	
	@Test (priority = 4, groups = "FooterLinks")
	public void testBusinessLink() {
		driver.findElement(By.partialLinkText("Business")).click();
		Assert.assertTrue(driver.getTitle().contains("Get Listed on Google"));
	}

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		driver.get("https://google.com");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest (alwaysRun = true)
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterTest (alwaysRun = true)
	public void afterTest() {
		driver.quit();
	}

}
