package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Login.feature",glue= {"test"},
monochrome=true,
plugin = {"pretty", "junit:target/JUNITReports/reportLogin.xml", "html:target/HTMLReports/reportLogin.html",
          "json:target/JSONReports/reportLogin.json"}
		)
public class SwagLabs_LoginPageTestRunner {

}
