package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/ConfirmPurchase.feature",glue= {"test"},
monochrome=true,
plugin = {"pretty", "junit:target/JUNITReports/reportConfirmPurchase.xml", "html:target/HTMLReports/reportConfirmPurchase.html",
          "json:target/JSONReports/reportConfirmPurchase.json"}
		)
public class SwagLabs_ConfirmPurchaseTestRunner {
	
}
