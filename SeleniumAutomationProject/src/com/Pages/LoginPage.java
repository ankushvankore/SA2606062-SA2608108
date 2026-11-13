package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	//Page Factory : is a subset of POM
	//It is repository of WebElements
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement userName;
	
	public LoginPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
		//This will intilize the WebElements those are declared using @FindBy 
	}
	
	public void enterUserName(String un) {
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		userName.sendKeys(un);
	}
	
	public void enterPassword(String ps) {
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public void directLogin(String un, String ps) {
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		userName.sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
