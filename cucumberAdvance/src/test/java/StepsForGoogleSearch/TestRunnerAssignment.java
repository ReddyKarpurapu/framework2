package StepsForGoogleSearch;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Assignment.feature",glue= {"StepsForGoogleSearch"},
monochrome=true,
plugin= {"pretty","html:reports/htmlReport/html",
"json:reports/JsonReport/Cucumber.json",
"junit:reports/junitReport/report.xml"},
tags =("@capgemini or @accenture"))
public class TestRunnerAssignment {

}
