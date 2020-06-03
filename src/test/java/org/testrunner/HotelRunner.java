package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.Jvmreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\HotelLogin.feature",glue="org.stepdefinition",monochrome=true,dryRun=false,tags= {"@Manual"},
plugin= {"pretty","html:src\\test\\resources\\Reports\\HtmlReports","junit:src\\test\\resources\\Reports\\JunitReports.xml",
		"json:src\\test\\resources\\Reports\\JsonReports.json"})

public class HotelRunner {
	@AfterClass
	public static void JVMReport() {
		Jvmreport.generateJvmReports(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\JsonReports.json");
	}

}
