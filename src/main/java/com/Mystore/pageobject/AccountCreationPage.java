/**
 * 
 */
package com.Mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.actiondriver.Action;
import com.Mystore.base.Baseclass;

/**
 * 
 */
public class AccountCreationPage extends Baseclass{
	@FindBy(xpath = "//h1[normalize-space()='Create an account']")
	WebElement FormTitle;
	
	public AccountCreationPage() {
		PageFactory.initElements(driver, this);
	}
	public boolean validateaccountcreationpage() throws Throwable {
		return Action.isDisplayed(driver, FormTitle);
	}
}
