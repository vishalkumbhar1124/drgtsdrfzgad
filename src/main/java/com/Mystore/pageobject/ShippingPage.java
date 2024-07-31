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
public class ShippingPage extends Baseclass {

	@FindBy(id="cgv")
	WebElement terms;
	
	@FindBy(xpath="//button/span[conatins(text(),'Proceed to checkout')]")
	WebElement proceedtocheckout;

	public ShippingPage() {
		PageFactory.initElements(driver, this);
	}
	public void checkTerms() throws Throwable{
		Action.click(driver, terms);
	}
	
public PaymentPage clickOnCheckout() throws Throwable {
Action.click(driver, proceedtocheckout);	
return new PaymentPage();
}
}
