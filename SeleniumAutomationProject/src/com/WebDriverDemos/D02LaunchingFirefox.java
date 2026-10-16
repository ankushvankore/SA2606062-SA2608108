package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class D02LaunchingFirefox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://github.com/ankushvankore/SA2606062-SA2608108");
		
		driver.close();

	}

}
