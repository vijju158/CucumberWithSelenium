package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",
glue = {"StepDefinition"},
monochrome = true,
dryRun = false,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html",
		"pretty","html:target/cucumber-reports",
		"junit:target/junit/cucumber.xml"}
)
public class Runner {
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("configs/extent-config.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Vijay Malladi");
	Reporter.setSystemInfo("Application Name", "Guru 99");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "QA");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
			
	}

