package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {
	
	@Before(order = 3)
	private void precondition1() {
		System.out.println("TaggedHooks");
	}
	@Before(order = 1)
	private void precondition2() {
		
		windowMaximize();	
	}
	@Before(order = 2)
	private void precondition3() {
		launchBrowser();
		
	}


	
	@After(order = 2)
	private void postcondition1() {
		closeEntireBrower();

	}
	@After(order = 1)
	private void postcondition2() {
		System.out.println("close the browser");

	}

}
