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
public class OrderPage extends Baseclass{
	@FindBy(xpath="//td[@class='cart_unit']/span/span")
	WebElement unitprice;
	@FindBy(id="total_price")
	WebElement totalprice;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement proceedToCheckout;
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public double getunitprice() {
		String unitprice1=unitprice.getText();
		String unit = unitprice1.replaceAll("[^a-zA-Z0-9]","");
	double finalunitprice =	Double.parseDouble(unit);
	return finalunitprice/100;
	}
	
	public LoginPage clickoncheckout()throws Throwable {
		Action.click(driver, proceedToCheckout);
		return new LoginPage();
	}
	
}
