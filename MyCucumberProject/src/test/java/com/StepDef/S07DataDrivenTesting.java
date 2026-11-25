package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07DataDrivenTesting {
	WebDriver driver;
	@Given("Launch expand testing page")
	public void launch_expand_testing_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://practice.expandtesting.com/login");
	}

	@When("Enter user name as {string}")
	public void enter_user_name_as(String un) {
	    driver.findElement(By.name("username")).sendKeys(un);
	}

	@When("Enter password {string}")
	public void enter_password(String ps) {
	    driver.findElement(By.name("password")).sendKeys(ps);
	}

	@When("Clcik on submit button")
	public void clcik_on_submit_button() {
	    driver.findElement(By.name("submit-login")).submit();
	}

	@Then("The Home page should display")
	public void the_home_page_should_display() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
	}

}
