package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbNewAccountPojo extends BaseClass {
	public FbNewAccountPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")
	private WebElement account;

	@FindBy(name = "firstname")
	private WebElement fstname;

	@FindBy(name = "lastname")
	private WebElement surname;

	@FindBy(name = "reg_email__")
	private WebElement email;

	@FindBy(name = "reg_passwd__")
	private WebElement password;

	public WebElement getAccount() {
		return account;
	}

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

}
