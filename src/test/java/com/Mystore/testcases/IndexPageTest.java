/**
 * 
 */
package com.Mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mystore.base.Baseclass;
import com.Mystore.pageobject.IndexPage;

/**
 * 
 */
public class IndexPageTest extends Baseclass {
	IndexPage indexpage;
	
	@BeforeMethod
	public void setup() {
		launchApp();
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void Verifylogo () throws Throwable {
		IndexPage indexpage = new IndexPage();
		boolean result = indexpage.ValidateLogo();
		Assert.assertTrue(result);
	}
	
	@Test
	public void verifyTitle() throws Throwable{
		indexpage =new IndexPage();
		String actTitle = indexpage.getMystoreTitle();
		Assert.assertEquals(actTitle, "My Store");
		}
	
}
