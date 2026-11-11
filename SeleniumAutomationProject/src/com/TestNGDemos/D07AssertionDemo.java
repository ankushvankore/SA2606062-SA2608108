package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D07AssertionDemo {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", actUrl;
	@Test(dataProvider = "loginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(ps);
		driver.findElement(By.tagName("button")).click();
		
		actUrl = driver.getCurrentUrl();
		//Assert.assertEquals(actUrl, expUrl);
		//Assert.assertTrue(expUrl.equals(actUrl));
		Assert.assertTrue(actUrl.contains("dashboard"), "Invalid credtionals!!!");
	}

	@DataProvider
	public Object[][] loginData() {
		return new Object[][] {
			new Object[] { "admin", "admin123" },
			new Object[] { "hari", "hari123" },
			new Object[] { "admin", "admin123" },
			new Object[] { "mahidhar", "mahi123" },
		};
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
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
