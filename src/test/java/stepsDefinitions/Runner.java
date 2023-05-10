package stepsDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = {"stepsDefinitions"}, //tags = ("@SmokeTest"),
        monochrome = true,
        plugin = {"pretty", "html:target/reports",
                    "json:target/JSONReports/reports.json",
                    "junit:target/JUNITReports/reports.xml"} //3 different ways to generate reports(html, junit/xml, json)
)
public class Runner {

}
