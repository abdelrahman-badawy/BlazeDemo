package com.BlazeDemo.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;

import pages.signupPage;

public class SignupTest extends Base {

	signupPage signupPage;
	
	public SignupTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	@Test
	public void signupTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
	
		
		signupPage = new signupPage();
		signupPage.clickhomeSignup();
		signupPage.waitforElement();
		signupPage.insertUsername();
		signupPage.insertPassword();
		signupPage.clickSignup();
		signupPage.waitforElement();
		Utils.takeSnapshot(method.getName());
		Assert.assertEquals(signupPage.getAlertmessage(), "Sign up successful.");
		signupPage.closeAlert();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
		
	}

}
