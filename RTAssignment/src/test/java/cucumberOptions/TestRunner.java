package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue ="stepDefinations", stepNotifications = true, tags="@amazon", monochrome=true,
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})

public class TestRunner {

}
