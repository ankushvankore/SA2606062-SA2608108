package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D29NavigationMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//driver.get("https://google.com");
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Store")).click();
		System.out.println(driver.getTitle());
		
		driver.navigate().back();			//Will go 1 level back
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();		//Will go 1 level forward
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();		//Will refresh the page
	}

}
