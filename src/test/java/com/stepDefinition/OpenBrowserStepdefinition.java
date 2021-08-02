package com.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OpenBrowserStepdefinition {

	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	   
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(" Welcome to my world ");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

	@When("launch browser")
	public void launch_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" Welcome to my world ");
	}

}
