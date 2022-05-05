package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/java/Features",
        glue = {"StepDefinitions"},
        tags = "@TagExample",
        plugin = {"html:reports/HTML_reports/report.html"}

)

public class TestRunner {

}
