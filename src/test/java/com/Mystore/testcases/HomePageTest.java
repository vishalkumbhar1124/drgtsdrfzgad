/**
 * 
 */
package com.Mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mystore.base.Baseclass;
import com.Mystore.pageobject.HomePage;
import com.Mystore.pageobject.IndexPage;
import com.Mystore.pageobject.LoginPage;

/**
 * 
 */
public class HomePageTest extends Baseclass {
	IndexPage indexPage;
	LoginPage loginPage;
	HomePage homePage;
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		@Test
		public void verifyWishlist() throws Throwable {
			indexPage = new IndexPage();
			loginPage = indexPage.clickonsign();
			homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			boolean result =homePage.va
		
		}
		
		

}
