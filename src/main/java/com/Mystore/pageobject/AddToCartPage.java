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
public class AddToCartPage extends Baseclass{
	@FindBy(id="quantity_wanted")
	WebElement qnt;
	
	@FindBy(name="group_1")
	WebElement size;
	
	@FindBy(xpath="//span[text()='Add to cart']")
	WebElement addtocartbtn;
	
	@FindBy(xpath ="//*[@id=\"layer_cart\"]//h2/i" )
	WebElement addtocart;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	WebElement checkout;
	public AddToCartPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterquantity(String qnt1) throws Throwable {
		Action.type(qnt, qnt1);
	}
	public void selectsize(String size1) throws Throwable{
		Action.selectByVisibleText(size1,size);
	}
	public void clickonaddtocart() throws Throwable {
		Action.click(driver, addtocartbtn);
	}
	public boolean validateaddtocart() throws Throwable {
		return Action.isDisplayed(driver, addtocart);
	}
	public OrderPage clickCheckOut() {
		Action.JSClick(driver, checkout);
		return new OrderPage();
	}
	


}
