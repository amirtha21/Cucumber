package TestRunner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions
		(
		features= {".//Features/Customer.feature"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		)	




public class TestRun {

}
