package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     //plugin={"html:target/cucumber-reports-smoke.html",
     //        "json:target/json-reports/cucumber.json",
     //       "junit:target/xml-report/cucumber.xml",
     //      },

        plugin = { "pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        features = "src/test/resources/features" ,
        glue = "stepdefinitions" ,
        tags= "@smoke",
        dryRun = false
)

public class Runner {

}
