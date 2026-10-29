package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D24Synchronization_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(driver);
		//driver.findElement(By.name("username")).sendKeys("admin");
		
		wait.withTimeout(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class)
			.pollingEvery(Duration.ofMillis(1))
			.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("admin");
		
		/*
		 * Please wait maximim for 5 seconds till the control is not visible
		 * After every milliseconds check whether the control is loaded or not (condition is satisfied or not)
		 * meanwhile if any other exception than NoSuchElementException is thrown then terminate the execution and 
		 * throw that exception
		 */
	}

}
