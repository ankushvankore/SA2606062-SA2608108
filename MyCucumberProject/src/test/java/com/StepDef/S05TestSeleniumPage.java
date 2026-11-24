package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class S05TestSeleniumPage {
	WebDriver driver;
	@Given("Open {string}")
	public void open(String string) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.selenium.dev/");		}

	@When("Click on downloads tab link")
	public void click_on_downloads_tab_link() {
	    driver.findElement(By.linkText("Downloads")).click();
	}

	@Then("Downloads page should open")
	public void downloads_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("download"));
	}

	@When("Click on documentation tab link")
	public void click_on_documentation_tab_link() {
	    driver.findElement(By.linkText("Documentation")).click();
	}

	@Then("Documentation page should open")
	public void documentation_page_should_open() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("documentation"));
	}

	@When("Click on Projects tab link")
	public void click_on_projects_tab_link() {
	    driver.findElement(By.linkText("Projects")).click();
	}

	@Then("Projects page should open")
	public void projects_page_should_open() {
		Assert.assertTrue(driver.getCurrentUrl().contains("projects"));
	}

	@When("Click on Support tab link")
	public void click_on_support_tab_link() {
	    driver.findElement(By.linkText("Support")).click();
	}

	@Then("Support page should open")
	public void support_page_should_open() {
	    Assert.assertTrue(driver.getCurrentUrl().contains("support"));
	}
}
