package testRunners;

import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.DriverFactory;

@CucumberOptions(
        plugin = {
                "summary",
                "pretty",
                "html:target/CucumberReport/Reports.html"
        },
        features = "src/test/java/features",
        glue = {"src/test/java/stepDefinitions", "utils"},
        tags = ""
)
public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();
}
