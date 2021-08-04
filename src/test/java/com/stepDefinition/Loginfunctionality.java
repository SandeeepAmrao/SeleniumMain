package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Loginfunctionality {

	 WebDriver driver= null; 
	
	 @Before public void setUp(){ 
	      
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 System.out.println(" Before Scenario ");
	   } 
	 
	   @Given("user navigates to Facebook")
	   public void user_navigates_to_Facebook() {
		   
		    driver.navigate().to("https://www.facebook.com/");
		   
	   }

	   
	   @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$") 
	   public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
	      driver.findElement(By.id("email")).sendKeys(arg1); //username
	      driver.findElement(By.id("pass")).sendKeys(arg2); //password
	      driver.findElement(By.name("login")).click();
	     
	   } 
		
	   @Then("^login should be unsuccessful$") 
	   public void validateRelogin() { 
	      if(driver.getCurrentUrl().equalsIgnoreCase(
	      "https://www.facebook.com/login.php?login_attempt=1&lwv=110")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
  
	   }    
	   
	   @After public void cleanUp(){ 
		      driver.close(); 
		      System.out.println(" After Scenario ");
		   } 
	
}

