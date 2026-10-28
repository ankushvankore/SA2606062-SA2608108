package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D22Synchronization_ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//ImplicitWait will wait for maximum 10 seconds till the control get loaded
		//it is applicable throughout the script (for every statement)
		

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Login
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.className("oxd-button")).click();
		driver.findElement(By.tagName("button")).click();
		
		//Logout
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

}
