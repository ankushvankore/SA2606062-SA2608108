package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D04GetTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		String title = driver.getTitle();		
		System.out.println("Title: " + title);
		
		if(title.equals("Swag Labs")){
			System.out.println("Title matching!!! Test case pass");
		}
		else {
			System.out.println("Title not matching!!! Test case fail");
		}
				
		driver.close();
	}

}
