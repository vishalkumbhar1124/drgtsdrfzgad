package com.Mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Mystore.actiondriver.Action;
import com.Mystore.base.Baseclass;

public class IndexPage extends Baseclass{
	
	//TimeLIne 1:05hr
@FindBy(xpath = "//a[normalize-space()='Sign in']")
WebElement signbtn ;

@FindBy(xpath = "//img[@alt='My Shop']")
WebElement mystorelogo ;

@FindBy(xpath = "//input[@id='search_query_top']")
WebElement searchproductbtn ;

@FindBy(xpath ="//button[@name='submit_search']")
WebElement searchbtn;

public IndexPage() {
	PageFactory.initElements(driver, this);
}
public LoginPage clickonsign() {
	Action.click(driver, signbtn);
	return new LoginPage();
}
public boolean ValidateLogo() throws Throwable{
	return Action.isDisplayed(driver,mystorelogo );
}
public String getMystoreTitle() {
	String mystoretitle = driver.getTitle();
	return mystoretitle;
}
public SearchResultPage SearchProduct(String productName) throws Throwable{
	Action.type(searchproductbtn, productName);
	Action.click(driver, searchbtn);
	return new SearchResultPage();
}


}
