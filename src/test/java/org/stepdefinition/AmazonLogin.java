package org.stepdefinition;

import java.util.List;

import org.base.AmazonPojo;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class AmazonLogin extends BaseClass {

	AmazonPojo ap;

//	@Given("TO launch the  chrome browser and maximise the window")
//	public void to_launch_the_chrome_browser_and_maximise_the_window() {
//		launchBrowser();
//		windowMaximize();
//	}
//
//	@When("launching  url")
//	public void launching_url() {
//		launchurl("https://www.amazon.in/");
//	}
//
//	@When("click the signin option")
//	public void click_the_signin_option() throws InterruptedException {
//		Thread.sleep(2000);
//		ap = new AmazonPojo();
//		clickBtn(ap.getSignin());
//	}
//
//	@When("pass the email id or mobil num in email field")
//	public void pass_the_email_id_or_mobil_num_in_email_field(DataTable d) {
//		List<List<String>> lists = d.asLists();
//		ap = new AmazonPojo();
//		passText(lists.get(0).get(0), ap.getEmail());
//
//	}
//
//	@When("click the continue button")
//	public void click_the_continue_button() throws InterruptedException {
//		Thread.sleep(2000);
//		ap = new AmazonPojo();
//		clickBtn(ap.getContinue());
//
//	}
//
//	@When("create the new password in password field")
//	public void create_the_new_password_in_password_field(DataTable d) {
//		List<String> list = d.asList();
//		ap = new AmazonPojo();
//		passText(list.get(0), ap.getPassword());
//	}
//
//	@When("check whether navigate to the home page or not of facebook")
//	public void check_whether_navigate_to_the_home_page_or_not_of_facebook() {
//		System.out.println("signin to amazon using list");
//	}
//
//	@Then("close the chrome  browser")
//	public void close_the_chrome_browser() {
//		closeEntireBrower();
//	}

}
