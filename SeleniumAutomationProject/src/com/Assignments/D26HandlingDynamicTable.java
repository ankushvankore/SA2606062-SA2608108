package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D26HandlingDynamicTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		List<WebElement>browserName = driver.findElements(By.xpath("//tbody[@id='rows']/tr/td[1]"));
		int rowIndex = 0;
		for(int i = 0; i < browserName.size(); i++) {
			String bName = browserName.get(i).getText();
			if(bName.contains("Chrome")) {
				rowIndex = i+1;
				break;
			}
		}
		System.out.println("Row Index of Chrome: " + rowIndex);
		
		List<WebElement>headers = driver.findElements(By.xpath("//tr[@id='headers']/th"));
		int colIndex = 0;
		for(int i = 0; i < headers.size(); i++) {
			if(headers.get(i).getText().contains("CPU")) {
				colIndex = i + 1;
				break;
			}
		}
		System.out.println("Column Index: " + colIndex);
		
		//table[@id='taskTable']/tbody/tr[3]/td[2]
		System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr["+rowIndex+"]/td["+colIndex+"]")).getText());
		
		//driver.close();
	}

}
