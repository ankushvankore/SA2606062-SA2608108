package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateUserPage {
	WebDriver driver;

	public CreateUserPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createNewUser(String fn, String mn, String lN, String un, String ps) {
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);		
	}
}
