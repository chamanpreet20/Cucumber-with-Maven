package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"step_definition"},
plugin={"html:target/cucumber-html-report"}
)
public class Run_feature {

}
