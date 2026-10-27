package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D19HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/?m=1");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select country = new Select(drpList);
		//Select class object accept object of WebElement as a parameter
		//now onwards every operation on drop down list is supposed to be performed 
		//only via this object.
		System.out.println("Selected Country: " + country.getFirstSelectedOption().getText());
		List<WebElement>allCountries = country.getOptions();
		System.out.println("Total countries: " + allCountries.size());
		
		//System.out.println("3rd Country: " + allCountries.get(2).getText());
		//System.out.println("6th Country: " + allCountries.get(5).getText());
		
		//for(int i = 0; i < allCountries.size(); i++)
			//System.out.println(allCountries.get(i).getText());
		
		for(WebElement c : allCountries)
			System.out.println(c.getText());
	}

}
