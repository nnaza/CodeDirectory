package com.qa.selenium.finish;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(
		
		//monochrome=true,
		
		//dryRun=true,
		features={ "src/test/resources/com/basic/"},
		glue={"com/qa/selenium/finish/"},
		
		
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport.html",
				
		}
		
		
		
		)

public class Runme {
	
	
	
	
	

}
