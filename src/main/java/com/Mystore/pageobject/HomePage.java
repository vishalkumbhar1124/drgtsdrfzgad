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
public class HomePage extends Baseclass {

	@FindBy(xpath = "//span[normalize-space()='Add my first address']")
	WebElement FirstAddress;
	
	@FindBy(xpath = "//span[normalize-space()='Order history and details']")
	WebElement OrderHistory;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void validateFirstAddress() {
		Action.isDisplayed(driver, FirstAddress);
		}
	public void validateOrderHistory() {
		Action.isDisplayed(driver, OrderHistory); //1:44hr
	}
	public String getCurrURL() {
		String homePageURL = driver.getCurrentUrl();
		return homePageURL;
	}
}
