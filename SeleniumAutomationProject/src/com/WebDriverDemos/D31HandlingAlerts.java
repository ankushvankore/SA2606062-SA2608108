package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D31HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/alerts");
		
		Alert alt;
		
		//Simple alert
		driver.findElement(By.id("alertButton")).click();
		alt = driver.switchTo().alert();
		//Will switch to an alert
		System.out.println("First alert says: " + alt.getText());
		Thread.sleep(2000);
		alt.accept();	//Will click on Ok button
		
		driver.findElement(By.id("timerAlertButton")).click();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		//This will wait till the alert get loaded
		alt = driver.switchTo().alert();
		System.out.println("Second alert says: " + alt.getText());
		alt.accept();
		
		//Confirmation Alert
		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println("Confirmation alert says: " + alt.getText());
		alt.dismiss();
		//Will click on Cancel button
		System.out.println("Message: " + driver.findElement(By.id("confirmResult")).getText());
		
		//Prompt alert / Input box
		driver.findElement(By.id("promtButton")).click();
		alt = driver.switchTo().alert();
		System.out.println("Prompt alert says: " + alt.getText());
		alt.sendKeys("Satish");
		alt.accept();
		System.out.println("Message: " + driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
	}

}
