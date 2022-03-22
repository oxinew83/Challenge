package recursos;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		//"src/test/java/features/CreateCategoryIncident.feature"		
		} , glue = { "steps" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Prueba.html",
	//"pretty",
	"html:target/htmlreports" }, monochrome = true
		)
public class TestRunner {
}

