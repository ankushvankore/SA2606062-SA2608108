package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D15HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		System.out.println("Before...");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Visible : " + chkBox.isDisplayed());
		
		if(chkBox.isSelected() == false && chkBox.isEnabled() == true)
			chkBox.click();
		
		System.out.println("After...");
		System.out.println("Selected: " + chkBox.isSelected());
		System.out.println("Enabled : " + chkBox.isEnabled());
		System.out.println("Visible : " + chkBox.isDisplayed());
	}

}
