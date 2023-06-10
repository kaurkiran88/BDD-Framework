package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/kataria99/Desktop/QA/CucumberWorkspace/DemoBlazeProject/src/main/java/features",
		glue= "stepDefinition",
	    stepNotifications = true,
		plugin= {"pretty","html:target/reports.html"},
		monochrome = true,
		dryRun = true
		)

public class TestRunner {
	
	
}
