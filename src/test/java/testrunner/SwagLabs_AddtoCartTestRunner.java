package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/AddtoCart.feature",glue= {"test"},
monochrome=true,
plugin = {"pretty", "junit:target/JUNITReports/reportAddtoCart.xml", "html:target/HTMLReports/reportAddtoCart.html",
          "json:target/JSONReports/reportAddtoCart.json"}
		)
public class SwagLabs_AddtoCartTestRunner {

}
