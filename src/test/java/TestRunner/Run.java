package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features=".//Feature/LoginPage.feature",
		glue="StepDefination",
		dryRun=false,
		monochrome=true,
		tags = "@kanha",
		plugin={"pretty","html:target/cucumber-Report/Report.html"}
		
		)


public class Run extends AbstractTestNGCucumberTests{

}
