package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//FeaturesFile/LoginFeature.feature",
		glue = "StepDefinition",
		
		//true  option will be checking the compatibility of the FeatureFule and StepDefinition
		dryRun = false,
		
		//output readable
		monochrome = true,
		
		//to do
		plugin = {"pretty","html:target/Cucumber-Reports/reports_html.html"}
		)
public class TestRunnerClass {
// 4:25:15 11th class
}
