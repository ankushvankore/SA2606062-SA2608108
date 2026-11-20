package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/F03MultipleScenarios.feature",
					glue = "com.StepDef")
public class R03MultipleScenarios {

}
