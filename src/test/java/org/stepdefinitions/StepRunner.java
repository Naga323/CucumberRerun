package org.stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\nagar\\eclipse-workspace\\CucumberJava\\Features\\login.feature", 
		glue = "org.stepdefinitions", dryRun = true)
public class StepRunner {
	
}
