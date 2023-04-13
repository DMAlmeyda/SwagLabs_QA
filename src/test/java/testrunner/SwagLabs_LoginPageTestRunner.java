package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"test"},
monochrome=true,
plugin = {"pretty", "junit:target/JUNITReports/report.xml", "html:target/HTMLReports/report.html",
          "json:target/JSONReports/report.json"}
		)
public class SwagLabs_LoginPageTestRunner {

}
