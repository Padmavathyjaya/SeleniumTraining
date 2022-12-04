package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {
	public AmazonPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//span[@class='nav-action-inner'])[2]")
	private WebElement signin;

	@FindBy(id = "ap_email")
	private WebElement email;

	@FindBy(id = "continue")
	private WebElement Continue;

	@FindBy(name = "password")
	private WebElement password;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getPassword() {
		return password;
	}

}
