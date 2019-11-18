package TestRunner;

import org.testng.annotations.Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//import cucumber.api.junit.Cucumber;
import cucumber.deps.difflib.myers.MyersDiff;
import junit.textui.TestRunner;
import net.masterthought.cucumber.json.Feature;

//@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",
glue={"StepDefinition"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
		"pretty","html:target/cucumber-reports",
		"junit:target/junit/cucumber.xml",
		"json:target/cucumber-jvm-report-html/cucumber-html-reports/cucumber.json"}
		)

public class NewTest extends AbstractTestNGCucumberTests {

}
