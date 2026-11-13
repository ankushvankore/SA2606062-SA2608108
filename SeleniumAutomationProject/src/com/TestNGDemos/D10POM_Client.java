package com.TestNGDemos;

import org.testng.annotations.Test;

import com.Pages.CreateUserPage;
import com.Pages.LoginPage;
import com.Pages.LogoutPage;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class D10POM_Client {
	WebDriver driver;
	LoginPage l1;
	LogoutPage l2;
	CreateUserPage c1;
	
	@Test (priority = 1)
	public void loginToOHRM() {
		//l1.enterUserName("admin");
		//l1.enterPassword("admin123");
		//l1.clickOnLoginButton();
		l1.directLogin("admin", "admin123");
	}
	
	@Test(priority = 2)
	public void createUser() {
		c1.createNewUser("Sourav", "M", "Patil", "sourav", "sourav123");
	}
	
	@Test (priority = 3)
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		l2.logout();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		l1 = new LoginPage(driver);
		l2 = new LogoutPage(driver);
		c1 = new CreateUserPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
