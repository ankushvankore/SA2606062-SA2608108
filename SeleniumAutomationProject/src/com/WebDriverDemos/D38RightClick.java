package com.WebDriverDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D38RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		Actions act = new Actions(driver);
		
		WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightClickBtn).perform();
	}

}
