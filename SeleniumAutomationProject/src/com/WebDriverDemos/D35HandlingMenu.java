package com.WebDriverDemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D35HandlingMenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		
		List<WebElement>allMenus = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']/li/a/span"));
		System.out.println("Total menus: " +allMenus.size());
		
		for(WebElement menu : allMenus)
			System.out.println(menu.getText());
		
		driver.quit();
	}

}
