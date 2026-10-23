package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		 
		  driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Ankita");
		  driver.findElement(By.cssSelector("input[class='form-control'][placeholder='Password']")).sendKeys("Ankita1234");
		  driver.findElement(By.cssSelector("input[name='Butsub']")).click();
		  
		  WebElement errormsg = driver.findElement(By.cssSelector("[class='error']"));
		  String msg = errormsg.getText();
		  System.out.println("error msg"+msg);
	}

}
