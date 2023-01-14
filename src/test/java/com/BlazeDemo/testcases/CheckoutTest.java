package com.BlazeDemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;

import pages.additemPage;
import pages.checkoutPage;


public class CheckoutTest extends Base{

	checkoutPage checkoutPage;
	additemPage additemPage;
	
	public CheckoutTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	@Test
	public void checkoutTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
		
		additemPage = new additemPage();
		checkoutPage = new checkoutPage();
		additemPage.addPhoneItem();
		additemPage.clickAddToCart();
		Thread.sleep(500);
		additemPage.closeAlert();
		checkoutPage.clickCart();
		checkoutPage.clickPlaceOrder();
		checkoutPage.insertName(prop.getProperty("Name"));
		checkoutPage.insertCountry(prop.getProperty("Country"));
		checkoutPage.insertCity(prop.getProperty("City"));
		checkoutPage.insertCard(prop.getProperty("Card"));
		checkoutPage.insertMonth(prop.getProperty("Month"));
		checkoutPage.insertYear(prop.getProperty("Year"));
		checkoutPage.clickPurchase();
		
		Utils.takeSnapshot(method.getName());
		
		Assert.assertEquals(checkoutPage.isThankyouDisplayed(), true);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
