package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05EchotrakLoginClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.className("btn btn-lg btn-block btn-primary"));
		loginBtn.click();
		WebElement errMessage = driver.findElement(By.id("lblMsg"));
		String msg = errMessage.getText();
		
		System.out.println("Error Message: " + msg);
		
		driver.close();
	}

}
