package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04AddCustomerPage {
	WebDriver driver;
	@Given("Launch CRM Add customer page")
	public void launch_crm_add_customer_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://automationplayground.com/crm/add-customer.html");
	}

	@When("Enter email Id as {string}")
	public void enter_email_id_as(String emailID) {
	    driver.findElement(By.id("EmailAddress")).sendKeys(emailID);
	}

	@When("Enter first name as {string}")
	public void enter_first_name_as(String fName) {
		driver.findElement(By.id("FirstName")).sendKeys(fName);
	}

	@When("Enter last name as {string}")
	public void enter_last_name_as(String lName) {
		driver.findElement(By.id("LastName")).sendKeys(lName);
	}

	@When("Enter City as {string}")
	public void enter_city_as(String city) {
		driver.findElement(By.id("City")).sendKeys(city);
	}

	@When("Select state as {string}")
	public void select_state_as(String state) {
	    //Select ddstate = new Select(driver.findElement(By.id("StateOrRegion")));
	    //ddstate.selectByVisibleText(state);
		new Select(driver.findElement(By.id("StateOrRegion"))).selectByVisibleText(state);
	}

	@When("Select gender {string}")
	public void select_gender(String gender) {
	    if(gender.equals("Male"))
	    	driver.findElement(By.xpath("//input[@value='male']")).click();
	    else
	    	driver.findElement(By.id("//input[@value='female']")).click();
	}

	@When("Select add to pramotional list")
	public void select_add_to_pramotional_list() {
	    driver.findElement(By.name("promos-name")).click();
	}

	@When("Click on Submit button")
	public void click_on_submit_button() {
	   //driver.findElement(By.className("btn-primary")).click();
		driver.findElement(By.className("btn-primary")).submit();
	}

	@Then("Customer should get added")
	public void customer_should_get_added() throws InterruptedException {
	    Thread.sleep(3000);
		String msg = driver.findElement(By.id("Success")).getText();
		Assert.assertTrue(msg.contains("Success"));	    
	}
}
