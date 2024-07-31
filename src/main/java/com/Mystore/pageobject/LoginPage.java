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
public class LoginPage extends Baseclass {

	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement Sigbtn;
	
	@FindBy(xpath = "//a[normalize-space()='Forgot your password?']")
	WebElement fgtbtn;

	@FindBy(xpath = "//input[@id='email_create']")
	WebElement creataccmail;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	WebElement AccCreBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String uname , String pwd ) throws Throwable{
		Action.type(username, uname);
		Action.type(password, pwd);
		Action.click(driver, Sigbtn);
		return new HomePage();
	}
	public AddressPage login1(String uname , String pwd ) throws Throwable{
		Action.type(username, uname);
		Action.type(password, pwd);
		Action.click(driver, Sigbtn);
		return new AddressPage();
	}
	public AccountCreationPage createacc(String email) throws Throwable{
		Action.type(creataccmail,email);
		Action.click(driver, AccCreBtn);
		return new AccountCreationPage();
	}

	
}
