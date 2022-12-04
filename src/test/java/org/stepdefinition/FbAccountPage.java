package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.base.FbNewAccountPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;

public class FbAccountPage extends BaseClass {

	FbNewAccountPojo fb;

	/*
	 * @Given("TO launch the  chrome browser and maximise the window") public void
	 * to_launch_the_chrome_browser_and_maximise_the_window() { launchBrowser();
	 * windowMaximize(); }
	 * 
	 * @When("launching url") public void launching_url() {
	 * launchurl("https://www.facebook.com/");
	 * 
	 * }
	 * 
	 * @When("click the create new account") public void
	 * click_the_create_new_account() throws InterruptedException {
	 * Thread.sleep(3000); fb = new FbNewAccountPojo(); clickBtn(fb.getAccount());
	 * 
	 * }
	 * 
	 * @When("pass the firstname in firstname field") public void
	 * pass_the_firstname_in_firstname_field(DataTable d) throws
	 * InterruptedException { Thread.sleep(3000); List<String> list = d.asList(); fb
	 * = new FbNewAccountPojo(); passText(list.get(0), fb.getFstname()); }
	 * 
	 * @When("pass the secondname in  surname field") public void
	 * pass_the_secondname_in_surname_field() { fb = new FbNewAccountPojo();
	 * passText("aishwarya", fb.getSurname());
	 * 
	 * }
	 * 
	 * @When("pass the email id or mobil num in email field") public void
	 * pass_the_email_id_or_mobil_num_in_email_field(DataTable d) {
	 * List<List<String>> listA = d.asLists(); fb = new FbNewAccountPojo();
	 * passText(listA.get(1).get(0), fb.getEmail());
	 * 
	 * }
	 * 
	 * @When("create the new password in password field") public void
	 * create_the_new_password_in_password_field() { fb = new FbNewAccountPojo();
	 * passText("password", fb.getPassword()); }
	 * 
	 * @When("check whether navigate to the home page or not of facebook") public
	 * void check_whether_navigate_to_the_home_page_or_not_of_facebook() {
	 * System.out.println("list..."); }
	 * 
	 * @Then("close the chrome  browser") public void close_the_chrome_browser() {
	 * closeEntireBrower();
	 * 
	 * }
	 */

}
