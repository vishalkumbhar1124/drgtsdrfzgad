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
public class AddressPage extends Baseclass{
@FindBy(xpath = "//span[text()='Proceed to checkout']")
WebElement proceedtocheckout;

public AddressPage() {
	PageFactory.initElements(driver, this);
}
public ShippingPage clickoncheckout() throws Throwable  {
	Action.click(driver, proceedtocheckout);
	return new ShippingPage();
}

}
