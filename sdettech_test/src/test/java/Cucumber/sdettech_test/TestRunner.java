package Cucumber.sdettech_test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinations",
		plugin="html:target/cucumber-html-report"
		)
public class TestRunner {

}
