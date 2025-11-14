package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"steps", "hooks"},
        plugin = {
                "progress",
                "summary",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        stepNotifications = true
)
public class TestRunner { }
