package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeTest_AfterTest {
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("Launching browser via before test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		System.out.println("Closing browser via after test");
		driver.quit();
	}
	
	@Test (priority = 2)
	public void testMyntra() {
		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@Test (priority = 1)
	public void testFlipkart() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@Test (priority = 4)
	public void testSnapdeal() {
		driver.get("https://www.snapdeal.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	@Test (priority = 3)
	public void testAmazon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
	}
}
