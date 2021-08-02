package com.testrunners;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 
@RunWith(Cucumber.class)
@CucumberOptions(

features = {"src/test/resources/featurefiles"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/reports/report.html"},
tags = {"@smoke"},
glue = {"com.stepDefinition"},
dryRun = false,
monochrome = false)

public class TestRunner {
	 
	}