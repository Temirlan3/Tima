package cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        },

        features = {"classpath:features"},
        glue = {"cucumber/step_defs"},
        tags = {"@Bank"},
        dryRun = false
)
public class RegressionRunner {
}
