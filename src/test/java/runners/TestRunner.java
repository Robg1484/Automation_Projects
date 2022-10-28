package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "steps",
		tags = "@AllScenarios",
		monochrome=true,
		dryRun = false,
		plugin = {
				"pretty",
				"html:target/cucumber.html",
				"json:target/cucumber.json"
		}
		)
public class TestRunner {

}
