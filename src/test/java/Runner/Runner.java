package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "target/Feature", glue = "Steps", tags = "@tag", plugin = { "pretty",
		"html:target/flashcode.html" }, monochrome = true, dryRun = false)

public class Runner {

}