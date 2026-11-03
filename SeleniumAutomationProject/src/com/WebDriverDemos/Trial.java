package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
		
//		login
	WebElement user	= driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys("Admin"); //admin123
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		WebElement sub = driver.findElement(By.xpath("//button[@type='submit']"));
		sub.click();
	}

}
