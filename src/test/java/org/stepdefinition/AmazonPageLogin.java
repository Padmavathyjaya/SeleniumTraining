package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.AmazonPojo;
import org.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class AmazonPageLogin extends BaseClass {

	AmazonPojo a;

//	@Given("launch the  chrome browser and maximise the window")
//	public void launch_the_chrome_browser_and_maximise_the_window() {
//		launchBrowser();
//		windowMaximize();
//	}
//
//	@When("launch the amazon url")
//	public void launch_the_amazon_url() {
//		launchurl("https://www.amazon.in/");
//	}
//
//	@When("click the signin option in homepage")
//	public void click_the_signin_option_in_homepage() throws InterruptedException {
//		Thread.sleep(2000);
//		a = new AmazonPojo();
//		clickBtn(a.getSignin());
//
//	}
//
//	@When("TO pass the email id or mobil num in email field")
//	public void to_pass_the_email_id_or_mobil_num_in_email_field(DataTable d) {
//		Map<String, String> map = d.asMap(String.class, String.class);
//		a = new AmazonPojo();
//		passText(map.get("thrdname"), a.getEmail());
//	}
//
//	@When("TO click the continue button")
//	public void to_click_the_continue_button() throws InterruptedException {
//		Thread.sleep(2000);
//		a = new AmazonPojo();
//		clickBtn(a.getContinue());
//	}
//
//	@When("To pass the new password in password field")
//	public void to_pass_the_new_password_in_password_field(DataTable d) {
//		List<Map<String, String>> maps = d.asMaps();
//		a = new AmazonPojo();
//		passText(maps.get(0).get("email1"), a.getPassword());
//	}
//
//	@When("Check the  whether navigate to the  facebook home page or not")
//	public void check_the_whether_navigate_to_the_facebook_home_page_or_not() {
//		System.out.println("signin to amazon using map");
//	}
//
//	@Then("close chrome browser")
//	public void close_chrome_browser() {
//		closeEntireBrower();
//	}

}
