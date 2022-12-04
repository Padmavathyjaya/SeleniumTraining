package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class RedBusPojo extends BaseClass {
	public RedBusPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "sign-in-icon-down")
	private WebElement click;

	@FindBy(id = "signInLink")
	private WebElement signin;
	
	@FindBy(xpath ="(//input[@class='IP'])[1]")
	private WebElement phnum;

	public WebElement getClick() {
		return click;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getPhnum() {
		return phnum;
	}

}
