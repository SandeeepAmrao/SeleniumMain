package com.testrunners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(

features = {"src/test/resources/featurefiles"},
plugin = {"pretty","html:target/cucumber-pretty","json:target/cucumber.json""},
tags = {"@smoke"},
glue = {"com.stepDefinition"},
dryRun = false,
monochrome = true

public class TestRunnerTest {
	 
	}