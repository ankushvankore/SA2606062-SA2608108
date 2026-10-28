package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D20HandlingMultipleElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement>products = driver.findElements(By.cssSelector("input[name^='option']"));
		
		/*for(int i = 0; i < products.size(); i++) {
			System.out.println("Before...");
			System.out.println("Selected: " + products.get(i).isSelected());
			System.out.println("Enabled : " + products.get(i).isEnabled());
			System.out.println("Visible : " + products.get(i).isDisplayed());
			
			//if(chkBox.isSelected() == false && chkBox.isEnabled() == true)
				//chkBox.click();
			if(!products.get(i).isSelected() && products.get(i).isEnabled())
				products.get(i).click();
			
			System.out.println("After...");
			System.out.println("Before...");
			System.out.println("Selected: " + products.get(i).isSelected());
			System.out.println("Enabled : " + products.get(i).isEnabled());
			System.out.println("Visible : " + products.get(i).isDisplayed());
		}*/
		
		for(WebElement p : products) {
			System.out.println("Before...");
			System.out.println("Selected: " + p.isSelected());
			System.out.println("Enabled : " + p.isEnabled());
			System.out.println("Visible : " + p.isDisplayed());
			
			//if(chkBox.isSelected() == false && chkBox.isEnabled() == true)
				//chkBox.click();
			if(!p.isSelected() && p.isEnabled())
				p.click();
			
			System.out.println("After...");
			System.out.println("Before...");
			System.out.println("Selected: " + p.isSelected());
			System.out.println("Enabled : " + p.isEnabled());
			System.out.println("Visible : " + p.isDisplayed());
		}
	}

}
