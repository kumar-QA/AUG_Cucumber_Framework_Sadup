package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		   features ="C:\\Users\\mpras\\eclipse-workspace\\FrameWork_Cucumber\\src\\test\\resource\\FeatureFiles",
		   glue={"stepdefination","hooks"},
		   plugin={
					"html:target/MyReports/report.html",
					"json:target/MyReports/Cucumber.json"
					},
		   monochrome = false

		
		)





public class TestRunner {

}
