package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D42HandlingCalender {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		/*for(int i = 1; i <= 4; i++) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();		//Will click twice on the arrow
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='16']")).click();*/
		
		String month = "Apr", day = "25";
		
		while(!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains(month)) {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}

}
