package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03MultipleScenarios {
	WebDriver driver;
	@Given("Launch Practice Page")
	public void launch_practice_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid user name")
	public void enter_valid_user_name() {
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
	}

	@When("Enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("successfully"));
	}

	//Invalid data
	
	@Given("Open Practice Page")
	public void open_practice_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter invalid user name")
	public void enter_invalid_user_name() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("sarmila");
	}

	@When("Enter invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
	}

	@When("I Click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}

	@Then("Error message should disply")
	public void error_message_should_disply() {
	    String msg = driver.findElement(By.id("error")).getText();
	    Assert.assertTrue(msg.equals("Your username is invalid!"));
	}

}
