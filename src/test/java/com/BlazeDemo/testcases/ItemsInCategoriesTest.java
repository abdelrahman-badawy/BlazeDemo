package com.BlazeDemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;

import pages.itemsInCategoriesPage;

public class ItemsInCategoriesTest extends Base{

	itemsInCategoriesPage itemsInCategoriesPage;
	
	public ItemsInCategoriesTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	@Test
	public void itemsInCategoriesTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
	
		
		itemsInCategoriesPage = new itemsInCategoriesPage();
		
		itemsInCategoriesPage.clickPhonesCategory();
		Assert.assertEquals(itemsInCategoriesPage.isSamsungGalaxyS6displayed(), true);
		Utils.takeSnapshot(method.getName());
		
		itemsInCategoriesPage.clickLaptopsCategory();
		Assert.assertEquals(itemsInCategoriesPage.isSonyVaioi5displayed(), true);
		Utils.takeSnapshot(method.getName());
		
		itemsInCategoriesPage.clickMonitorsCategory();
		Assert.assertEquals(itemsInCategoriesPage.isAsusFullHDdisplayed(), true);
		Utils.takeSnapshot(method.getName());
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
