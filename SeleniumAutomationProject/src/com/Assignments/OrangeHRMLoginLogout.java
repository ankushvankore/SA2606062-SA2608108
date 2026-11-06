package com.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class OrangeHRMLoginLogout {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}

	@Test
	public void loginToOHRM2() {
		driver.findElement(By.name("username")).sendKeys("saritha");
		driver.findElement(By.name("password")).sendKeys("saritha123");
		driver.findElement(By.tagName("button")).click();
	}
	
	@Test
	public void loginToOHRM3() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	}

	@Test
	public void loginToOHRM4() {
		driver.findElement(By.name("username")).sendKeys("parul");
		driver.findElement(By.name("password")).sendKeys("parul123");
		driver.findElement(By.tagName("button")).click();
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().equals(expUrl)) {
			System.out.println("Login sucessful!!!");
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.linkText("Logout")).click();
		}
		else {
			System.out.println("Login fail!!! Invalid credtionals!!!");
		}
			
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
