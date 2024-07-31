/**
 * 
 */
package com.Mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.base.Baseclass;

/**
 * 
 */
public class OrderConfirmationPage extends Baseclass{
	
	@FindBy(xpath="//p/strong[contains(text(),'Your order on My Store is complete.')]")
	WebElement confirmMessage;

	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateconfirmMessage() {
		String confirmMsg = confirmMessage.getText();
		return confirmMsg;
	}
}
