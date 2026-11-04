package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D36MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/?m=1");

		Actions act = new Actions(driver);
		WebElement pointMeButton = driver.findElement(By.xpath("//button[text()='Point Me']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 800)", "");
		
		act.moveToElement(pointMeButton).perform();
		
		List<WebElement>menus = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
