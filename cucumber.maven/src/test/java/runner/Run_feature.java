package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"step_definition"},
plugin={"html:target/cucumber-html-report","json:target/cucumber.json"}
,tags={"@web"}
)
public class Run_feature extends AbstractTestNGCucumberTests{

}