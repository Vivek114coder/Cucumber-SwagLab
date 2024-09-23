package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Feature",glue= {"StepDefination","AppHook"},monochrome=true,
plugin= {"pretty","html:target/report.html"})
public class TestRunner {
	

}
