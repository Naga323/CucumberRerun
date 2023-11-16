package org.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
	
public class StepDefinitions {			
	WebDriver driver;

	@Given("Facebook URl is launched")
	public void facebook_URl_is_launched() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("User Enters UserName and Password")
	public void user_Enters_UserName_and_Password() {
		driver.findElement(By.id("email")).sendKeys("nagaraj@123");
		driver.findElement(By.id("pass")).sendKeys("12345");
	}

	@And("User clicks Login button")
	public void user_clicks_Login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("Validate and take Screenshot")
	public void validate_and_take_Screenshot() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
