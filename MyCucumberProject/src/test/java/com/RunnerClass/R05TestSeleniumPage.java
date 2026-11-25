package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/F05TestSeleniumPage.feature",
					glue = "com.StepDef",
					publish = true)
public class R05TestSeleniumPage {
	/*
	 * Execute Single Scenario:		tags = "@RegressionTest"
	 * Execute multiple Scenarios:	tags = "@RegressionTest or @SmokeTest"
	 * Skip Single Scenario:		tags = "not @Validation"
	 * Skip Multiple Scenarios:		tags = "not @SanityTest and not @RegressionTest"
	 * Execute all Scenarios:		tags = "@AllSeleniumTests"
	 */
}
