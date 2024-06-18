package TestRunnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\programs\\Eclipse Programs\\PageRahulShetty\\src\\test\\java\\features",
		glue = "StepDefinations,Hook")
public class TestRunner1 {

}
