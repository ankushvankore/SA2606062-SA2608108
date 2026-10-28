package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A15EchoEchoCheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		WebElement milkCB = driver.findElement(By.name("option1"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + milkCB.isSelected());
		System.out.println("Enabled : " + milkCB.isEnabled());
		System.out.println("Visible : " + milkCB.isDisplayed());
		
		if(!milkCB.isSelected() && milkCB.isEnabled())
			milkCB.click();
		
		System.out.println("After...");
		System.out.println("Selected: " + milkCB.isSelected());
		System.out.println("Enabled : " + milkCB.isEnabled());
		System.out.println("Visible : " + milkCB.isDisplayed());

		//Second checkbox 
		WebElement butterCB = driver.findElement(By.name("option2"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + butterCB.isSelected());
		System.out.println("Enabled : " + butterCB.isEnabled());
		System.out.println("Visible : " + butterCB.isDisplayed());
		
		if(!butterCB.isSelected() && butterCB.isEnabled())
			butterCB.click();
		
		System.out.println("After...");
		System.out.println("Selected: " + butterCB.isSelected());
		System.out.println("Enabled : " + butterCB.isEnabled());
		System.out.println("Visible : " + butterCB.isDisplayed());
	}

}
