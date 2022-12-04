package org.stepdefinition;

import java.util.List;

import java.util.Map;

import org.base.BaseClass;
import org.base.FbNewAccountPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class CreateAcount extends BaseClass {

	FbNewAccountPojo f;

//	@Given("TO launch the  chrome browser and maximise the window")
//	public void to_launch_the_chrome_browser_and_maximise_the_window() {
//		launchBrowser();
//		windowMaximize();
//	}
//
//	@When("launch the facebook url")
//	public void launch_the_facebook_url() {
//		launchurl("https://www.facebook.com/");
//	}
//
//	@When("click the create new account for facebook account")
//	public void click_the_create_new_account_for_facebook_account() throws InterruptedException {
//		Thread.sleep(3000);
//		f = new FbNewAccountPojo();
//		clickBtn(f.getAccount());
//	}
//
//	@When("pass the firstname in firstname field of fb page")
//	public void pass_the_firstname_in_firstname_field_of_fb_page(DataTable d) throws InterruptedException {
//		Thread.sleep(3000);
//		Map<String, String> map = d.asMap(String.class, String.class);
//		f = new FbNewAccountPojo();
//		passText(map.get("thrdname"), f.getFstname());
//
//	}
//
//	@When("pass the surname in  surname field")
//	public void pass_the_surname_in_surname_field() {
//		f = new FbNewAccountPojo();
//		passText("dc", f.getSurname());
//
//	}
//
//	@When("pass the email id or mobil num in email field of fb page")
//	public void pass_the_email_id_or_mobil_num_in_email_field_of_fb_page(DataTable d) {
//		List<Map<String, String>> maps = d.asMaps();
//		f = new FbNewAccountPojo();
//		passText(maps.get(1).get("email1"), f.getEmail());
//	}
//
//	@When("create the new password in password field")
//	public void create_the_new_password_in_password_field() {
//		f = new FbNewAccountPojo();
//		passText("password", f.getPassword());
//	}
//
//	@When("check the  whether navigate to the  facebook home page or not")
//	public void check_the_whether_navigate_to_the_facebook_home_page_or_not() {
//		System.out.println("Maps..");
//	}
//
//	@Then("close the chrome browser")
//	public void close_the_chrome_browser() {
//		closeEntireBrower();
//
//	}

}
