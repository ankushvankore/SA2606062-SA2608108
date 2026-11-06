package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02OnlineShoppingApps {
	@Test (priority = 2)
	public void testMyntra() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.myntra.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}
	
	@Test (priority = 1)
	public void testFlipkart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}
	
	@Test (priority = 4)
	public void testSnapdeal() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.snapdeal.com/");
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}
	
	@Test (priority = 3)
	public void testAmazon() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.quit();
	}
}
