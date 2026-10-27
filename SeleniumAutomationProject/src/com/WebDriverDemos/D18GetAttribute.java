package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D18GetAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		System.out.println("Text          : " + homeLink.getText());
		System.out.println("href attribute: " + homeLink.getAttribute("href"));
		
		System.out.println("------------------------------------------");
		
		WebElement textBox = driver.findElement(By.id("name"));
		System.out.println("Class of Control      : " + textBox.getAttribute("class"));
		System.out.println("placeholder of Control: " + textBox.getAttribute("placeholder"));
		System.out.println("Type of Control       : " + textBox.getAttribute("type"));
		
		driver.close();
	}

}
