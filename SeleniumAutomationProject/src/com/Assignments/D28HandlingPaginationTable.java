package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D28HandlingPaginationTable {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * 1. Display total no of pages
		 * 2. Open each page (Click on the link)
		 * 3. Select each checkbox on each page
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		List<WebElement>pages = driver.findElements(By.xpath("//ul[@id='pagination']/li/a"));
		System.out.println("Total pages: " + pages.size());
		
		for(WebElement p : pages) {
			p.click();
			Thread.sleep(500);
			
			List<WebElement>chkBox = driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr/td[4]/input"));
			for(WebElement cb : chkBox) {
				cb.click();
				Thread.sleep(500);
			}				
		}
		
	}
}
