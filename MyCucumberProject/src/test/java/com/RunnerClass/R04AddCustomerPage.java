package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/F04AddCustomerPage.feature",
					glue = "com.StepDef")

public class R04AddCustomerPage {

}
