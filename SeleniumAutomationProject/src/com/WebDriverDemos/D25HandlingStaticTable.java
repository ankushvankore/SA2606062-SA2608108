package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingStaticTable {

	public static void main(String[] args) {
		//Ctrl + Shift + O to import all in the class
		/*
		 * Possible operations on Static Table
		 * 1. Read title/header of each column
		 * 2. Get total no of rows
		 * 3. Get any specific row
		 * 4. 
		 * 5. Display single column 
		 * 6. Get the value of specific cell
		 */
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");

		List<WebElement>headers = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th"));
		//Display all headers
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
		System.out.println("Total Rows: " + rows.size());
		
		System.out.println(rows.get(5).getText());
		
		//Data of single column
		List<WebElement>bookName = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[1]"));
		System.out.println("Data from Book Name Column...");
		for(WebElement bn : bookName)
			System.out.println(bn.getText());
		
		
		
		driver.close();
	}

}
