package com.WebDriverDemos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class D41Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("pact1")));
		
		driver.findElement(By.id("inp_val")).sendKeys("Selenium");
		
		TakesScreenshot ss = (TakesScreenshot) driver;
		File myScreenshot = ss.getScreenshotAs(OutputType.FILE);
		//Will capture a screenshot as a file and this is file virtual (object)
		//FileHandler.copy(myScreenshot, new File("D:\\MyScreenshot.jpeg"));
		FileHandler.copy(myScreenshot, new File("Screenshots\\MyScreenshot.jpeg"));
		System.out.println("Screenshot captured!!! Saved...");
		
		//Take a screenshot of single control
		WebElement txtBox = driver.findElement(By.id("inp_val"));
		File ssTxtBox = txtBox.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ssTxtBox, new File("Screenshots\\TextBox.jpeg"));		
		
		driver.close();
	}

}
