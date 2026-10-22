package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11LocateByCssSelectorAttributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");;
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Name']")).sendKeys("Sarmila");
		driver.findElement(By.cssSelector("input[class='form-control'][id='email']")).sendKeys("sarmila@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Enter Phone']")).sendKeys("8989898989");
	}

}
