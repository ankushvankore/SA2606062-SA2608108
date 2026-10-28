package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A16OHRMLoigin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.className("oxd-button")).click();
		driver.findElement(By.tagName("button")).click();
		
		//Logout
		driver.findElement(By.className(".bi-x")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
