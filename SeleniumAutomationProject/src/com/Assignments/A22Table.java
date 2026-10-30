package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22Table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		List<WebElement>price = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
		
		int total = 0;
		for(WebElement p : price) {
			//System.out.println(p.getText());
			total = total + Integer.parseInt(p.getText());
		}
		System.out.println("Total Price: " + total);
		
		driver.close();
	}

}
