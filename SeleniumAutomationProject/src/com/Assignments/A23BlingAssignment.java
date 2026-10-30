package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23BlingAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://dash.bling-center.com/platform/signIn.html");

		driver.findElement(By.xpath("//button[@class='forget-password-btn']")).click();
		driver.findElement(By.id("email1")).sendKeys("saritha@gmail.com");
		driver.findElement(By.cssSelector(".reset-pwd")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Message: " + driver.findElement(By.id("resetsuccess")).getText());
	}

}
