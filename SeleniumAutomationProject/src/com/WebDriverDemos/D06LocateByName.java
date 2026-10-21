package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement userName = driver.findElement(By.name("user-name"));
		//Please find and return a control on the page whose name is username 
		//and store this control in userName object.
		//This object will refer the control on the page.
		//The operations on this object will be done the control on the page
		userName.sendKeys("pooja123");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("pooja@123");
		
		WebElement loginBtn = driver.findElement(By.name("login-button"));
		loginBtn.click();
	}

}
