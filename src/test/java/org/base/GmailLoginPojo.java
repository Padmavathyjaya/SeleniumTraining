package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPojo extends BaseClass {

	public GmailLoginPojo() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="identifier")
	private WebElement email;
	
	@FindBy(xpath = "(//div[@class='VfPpkd-RLmnJb'])[2]")
	private WebElement next;

	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement password;

	@FindBy(name = "Passwd")
	private WebElement login;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	

//	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
//	private WebElement login;

}
