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
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//window.scrollBy(horizontal, vertical)
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0, 300)", "");
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Dell\\Downloads/images.png");
		
		
		WebElement drpList = driver.findElement(By.xpath("//*[@id='state']/div[1]/div[2]/div"));
		drpList.click();
		
		
		//arguments[0].click()	-- Will click on the control via Javascript
		js.executeScript("arguments[0].click()", drpList);
		
		WebElement optRajsthan = driver.findElement(By.id("react-select-3-option-3"));
		js.executeScript("arguments[0].click()", optRajsthan);
		
		
	}

}
