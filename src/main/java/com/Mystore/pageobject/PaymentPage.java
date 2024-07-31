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
public class PaymentPage extends Baseclass {

	@FindBy(xpath = "//a[conatins(text(),'Pay by bank wire')]")
	WebElement bankWireMethod;
	
	@FindBy(xpath = "//a[conatins(text(),'Pay by check')]")
	WebElement payByCheckMethod;
	
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	public OrderSummeryPage clickonpayment() {
		Action.click(driver, bankWireMethod);
		return new OrderSummeryPage();
	}
	



}
