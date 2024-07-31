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
public class OrderSummeryPage extends Baseclass{
@FindBy(xpath="//span[conatins(text(),'I confirm my order')]")
WebElement confirmorderbtn;
	
	
	
	public OrderSummeryPage() {
		PageFactory.initElements(driver, this);
	}
	
	public OrderConfirmationPage clickonconfirmorder() {
		Action.click(driver, confirmorderbtn);
		return new OrderConfirmationPage();
	}
}
