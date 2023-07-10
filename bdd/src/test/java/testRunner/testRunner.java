package testRunner;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue={"testRunner"},
plugin= {"pretty","html:target/cucumber-reports/report.html"},
  monochrome=true
)

public class testRunner {

}
