package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users//dtg_egrassa//untitled2//Features//OrangeHRM.feature",
        glue = "stepDefinition")

public class TestRunner
{
}
