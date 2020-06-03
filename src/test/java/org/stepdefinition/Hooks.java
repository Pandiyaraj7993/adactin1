package org.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
public void beforeScenario() {
	System.out.println("Before Scenario");
}
@Before(order=1)
public void scenario() {
	System.out.println();
}
@After
public void AfterScenario() {
	System.out.println("After Scenario");
}
@After(order=1)
public void Scenario() {
	System.out.println();
}
}
