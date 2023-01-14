package com.BlazeDemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;

import pages.additemPage;
import pages.removeitemPage;

public class RemoveItemTest extends Base{

	additemPage additemPage;
	removeitemPage removeitemPage;
	
	public RemoveItemTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	@Test
	public void removeItemTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
	
		additemPage = new additemPage();
		removeitemPage = new removeitemPage();
		additemPage.addPhoneItem();
		additemPage.clickAddToCart();
		Thread.sleep(500);
		additemPage.closeAlert();
		removeitemPage.clickCart();
		removeitemPage.waitforElement();
		removeitemPage.clickDelete();
		removeitemPage.waitforElement();
		Utils.takeSnapshot(method.getName());
		Assert.assertEquals(removeitemPage.isTotalElementdisplayed(), false);
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
