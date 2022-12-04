package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICICIPojo extends BaseClass {

	public ICICIPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "modal-close")
	private WebElement close;

	@FindBy(xpath = "(//a[@class='ic-btn'])[1]")
	private WebElement clicklogin;

	@FindBy(id = "user-id-goahead")
	private WebElement go;

	@FindBy(xpath = "(//input[contains(@class,'login-input')])[2]")
	private WebElement username;

	@FindBy(xpath = "(//input[contains(@class,'login-input')])[3]")
	private WebElement password;

	public WebElement getClose() {
		return close;
	}

	public WebElement getClicklogin() {
		return clicklogin;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

}
