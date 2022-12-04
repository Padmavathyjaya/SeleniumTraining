package org.stepdefinition;

import org.base.BaseClass;
import org.base.RedBusPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBuspage extends BaseClass {

	RedBusPojo r;

	@Given("TO launch the  chrome browser and maximise the window")
	public void to_launch_the_chrome_browser_and_maximise_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("launching  url")
	public void launching_url() {
		launchurl("https://www.redbus.in/");
	}

	@When("click login option")
	public void click_login_option() {
		r = new RedBusPojo();
		clickBtn(r.getClick());
	}

	@When("click signin")
	public void click_signin() {
		r = new RedBusPojo();
		clickBtn(r.getSignin());
	}

	@When("pass the phonenumber")
	public void pass_the_phonenumber(){
		r = new RedBusPojo();
		passText("6381365440", r.getPhnum());

	}

	@When("check whether navigate to the home page or not of facebook")
	public void check_whether_navigate_to_the_home_page_or_not_of_facebook() {
		System.out.println("....");
	}

	@Then("close the chrome  browser")
	public void close_the_chrome_browser() {
		closeEntireBrower();
	}

}
