package RunnerCrm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:\\Users\\Shashi\\eclipse-workspace\\ZzzRevisionCucumber\\src\\main\\java\\Feature\\deals.feature",
				glue= {"stepDefinition"},
				format= {"pretty", "html:html_output", "json:json_output/cucumber.json", "junit:junit_output/cucumber.xml"},
				monochrome=true,
				dryRun=false )
public class Runner {

}
