package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A19GoogleLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links: " + allLinks.size());
		
		for(WebElement link : allLinks)
			System.out.println(link.getText() + " => " + link.getAttribute("href"));
		
		driver.close();
	}

}
