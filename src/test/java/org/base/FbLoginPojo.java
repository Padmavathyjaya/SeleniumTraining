package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='inputtext _55r1 _6luy']")
	private WebElement email;

	@FindBy(name ="pass")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
