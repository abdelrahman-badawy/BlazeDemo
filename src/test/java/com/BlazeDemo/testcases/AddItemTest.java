package com.BlazeDemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;

import pages.additemPage;

public class AddItemTest extends Base{

	additemPage additemPage;
	
	public AddItemTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	@Test
	public void addItemTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
	
		
		additemPage = new additemPage();
		additemPage.addPhoneItem();
		additemPage.clickAddToCart();
		additemPage.waitforElement();
		Utils.takeSnapshot(method.getName());
		Assert.assertEquals(additemPage.getAlertmessage(), "Product added");
		additemPage.closeAlert();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}
	
	

}
