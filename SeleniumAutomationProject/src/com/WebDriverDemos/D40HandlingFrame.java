package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D40HandlingFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("pact1")));
		
		driver.findElement(By.id("inp_val")).sendKeys("Selenium");
	}

}
