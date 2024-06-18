package StepDefinations;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import HookFile.Hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdefination2 {
	
	@Given("^select textbox enter \"([^\"]*)\"$")
	public void select_textbox_enter(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		Hook.driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Home page is open");
		
		 
	}
	
	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   Hook.driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']")).sendKeys(arg1);
	   
	   
	}

	@Then("^\"([^\"]*)\" is shown on textbox$")
	public void is_shown_on_textbox(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		Hook.driver.close();
		
		
		 
	}

}
