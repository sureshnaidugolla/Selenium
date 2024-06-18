package StepDefinations;


import java.util.List;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import HookFile.Hook;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepdefination1 {
	
	List <WebElement> radiolist;
	
	@Given("^select radio buttons$")
	public void select_radio_buttons() {
	    // Write code here that turns the phrase above into concrete actions
		Hook.driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Home page is open");
		
		 
	}
	
	@When("^we click on \"([^\"]*)\"$")
	public void we_click_on(String str1) {
	    // Write code here that turns the phrase above into concrete actions
		radiolist=Hook.driver.findElements(By.xpath("//input[@class='radioButton']"));
		System.out.println("RadioList of elements taken");
		for(int i=0;i<radiolist.size();i++) {		
			if(str1.equalsIgnoreCase(radiolist.get(i).getAttribute("value").toString())) {
				radiolist.get(i).click();
				System.out.println("Radio2 is clicked ");
				break;
			}
		}
		
		 
	}


	@Then("^radio button is selected$")
	public void radio_button_is_selected() {
	    // Write code here that turns the phrase above into concrete actions
		if(Hook.driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[2]")).isEnabled()) {
			Hook.driver.close();
		}
		
		
	}
	

}
