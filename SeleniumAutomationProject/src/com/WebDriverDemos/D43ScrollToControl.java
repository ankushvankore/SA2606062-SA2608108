package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D43ScrollToControl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement table = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", table);
	}

}
