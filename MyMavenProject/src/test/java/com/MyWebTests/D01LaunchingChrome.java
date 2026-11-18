package com.MyWebTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		System.out.println("Title:  " + driver.getTitle());
		
		driver.quit();
	}

}
