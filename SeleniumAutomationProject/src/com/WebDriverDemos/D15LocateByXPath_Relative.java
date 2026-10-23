package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15LocateByXPath_Relative {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://automationplayground.com/crm/login.html");
		
		driver.findElement(By.xpath("//form[@action='customers.html']/div[1]/input")).sendKeys("mahidhar@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("mahidhar");
		//driver.findElement(By.xpath("//*[@id='submit-id']")).click();
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/form/button")).click();
	}

}
