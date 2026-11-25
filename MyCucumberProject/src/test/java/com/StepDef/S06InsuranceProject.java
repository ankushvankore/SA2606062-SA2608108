package com.StepDef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class S06InsuranceProject {
	WebDriver driver;
	@Given("Launch Tricentis Vehicle Insurance Application")
	public void launch_tricentis_vehicle_insurance_application() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://sampleapp.tricentis.com/101/index.php");
	}

	@When("Click on Automobile link")
	public void click_on_automobile_link() {
	    driver.findElement(By.partialLinkText("Auto")).click();
	}

	@When("I will enter following data for this step")
	public void i_will_enter_following_data_for_this_step(io.cucumber.datatable.DataTable dataTable) {
	    System.out.println(dataTable);
	    List<List<String>>data = dataTable.asLists();
	    System.out.println(data);
	    
	    new Select(driver.findElement(By.id("make"))).selectByVisibleText(data.get(0).get(0));
	    driver.findElement(By.id("engineperformance")).sendKeys(data.get(0).get(1));
	    driver.findElement(By.id("dateofmanufacture")).sendKeys(data.get(0).get(2));
	    new Select(driver.findElement(By.id("numberofseats"))).selectByVisibleText(data.get(0).get(3));
	    new Select(driver.findElement(By.id("fuel"))).selectByVisibleText(data.get(0).get(4));
	    driver.findElement(By.id("listprice")).sendKeys(data.get(0).get(5));
	    driver.findElement(By.id("licenseplatenumber")).sendKeys(data.get(0).get(6));
	    driver.findElement(By.id("annualmileage")).sendKeys(data.get(0).get(7));
	    
	}
}
