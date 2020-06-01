package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\HotelLogin.feature",glue="org.stepdefinition",monochrome=true,dryRun=false,tags= {"@Manual"})
public class HotelRunner {

}
