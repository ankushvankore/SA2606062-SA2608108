package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D33JavascriptExecutorDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://assertqa.com/");
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement button  = driver.findElement(By.xpath("//span[text()='Start Your Project']"));
		
		//js.executeScript("window.scrollBy(0, 200)", "");		
		//button.click();
		js.executeScript("arguments[0].click()", button);		
	}

}
