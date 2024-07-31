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
public class SearchResultPage extends Baseclass{

		@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
		WebElement productresult;
		
		public SearchResultPage() {
			PageFactory.initElements(driver, this);
		}
		public boolean isproductavailable() throws Throwable{
			return Action.isDisplayed(driver, productresult);
		}
		public AddToCartPage clickonproduct()throws Throwable {
			Action.click(driver, productresult);
			return new AddToCartPage();
		}

}
