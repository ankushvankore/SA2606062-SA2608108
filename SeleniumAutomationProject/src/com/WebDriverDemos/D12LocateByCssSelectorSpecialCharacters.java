package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByCssSelectorSpecialCharacters {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.cssSelector("input[name^='name']")).sendKeys("Santhosh Reddy");
		driver.findElement(By.cssSelector("input[name^='login']")).sendKeys("santhosh");
	}

}
