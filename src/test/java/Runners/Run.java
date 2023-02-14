package Runners;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/FeatureFiles",
		glue = {"StepDefinitions"}
		
		
		)
public class Run extends AbstractTestNGCucumberTests
{

}
