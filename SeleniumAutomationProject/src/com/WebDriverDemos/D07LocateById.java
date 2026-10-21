package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateById {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		WebElement userName = driver.findElement(By.id("email-id"));
		userName.sendKeys("bhagyashri@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("bhagyashri");
		WebElement loginBtn = driver.findElement(By.id("submit-id"));
		loginBtn.click();
	}

}
