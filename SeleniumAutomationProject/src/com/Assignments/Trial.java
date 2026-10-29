package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@onclick='setTimeout(myFunctionAXD,10000)']")).click();
		
		WebElement chkBox = driver.findElement(By.id("dte"));
		
		System.out.println("Before...");
		System.out.println("Enabled: " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
		
		Thread.sleep(10000);
		chkBox.click();
		
		System.out.println("After...");
		System.out.println("Enabled: " + chkBox.isEnabled());
		System.out.println("Selected: " + chkBox.isSelected());
	}

}
