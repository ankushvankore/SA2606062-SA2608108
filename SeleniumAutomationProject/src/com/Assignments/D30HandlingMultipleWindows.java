package com.Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D30HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.naukri.com/");

		driver.findElement(By.xpath("//span[text()='Remote']")).click();
		System.out.println("Title: " + driver.getTitle());
		
		Set<String>allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		Object[] windowsArray = allWindows.toArray();
		//Holding ids of all open windows
		String win1 = (String) windowsArray[0];
		//1st id
		String win2 = (String) windowsArray[1];
		//2nd id
		
		driver.switchTo().window(win2);	//switch to new page
		Thread.sleep(5000);
		System.out.println("Title: " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='filter-wfhType-panel']/div/div[1]/label/i")).click();
		
		driver.switchTo().window(win1);	//Switch to home page
		driver.findElement(By.linkText("Login")).click();
		
		//driver.close();	//Will close the current window
		driver.quit();
	}

}
