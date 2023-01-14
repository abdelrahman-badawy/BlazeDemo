package com.BlazeDemo.testcases;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Blaze.base.Base;
import com.BlazeDemo.util.Utils;
import com.beust.jcommander.Parameter;

import pages.loginPage;

public class LoginTest extends Base{
	
	loginPage loginPage;
	
	public LoginTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setup() {
		
		initialization(prop.getProperty("URL"));
	}
	
	
	@Test
	public void loginTest(java.lang.reflect.Method method) throws InterruptedException, IOException{
	
		
		loginPage = new loginPage();
		loginPage.clickhomeLogin();
		loginPage.waitforElement();
		loginPage.insertUsername(prop.getProperty("userName"));
		loginPage.insertPassword(prop.getProperty("password"));
		loginPage.clickLogin();
		
		Utils.takeSnapshot(method.getName());
		
		loginPage.waitforElement();
		Assert.assertEquals(loginPage.isNameofuserdisplayed(), true);
	}
	
	@AfterMethod //code to be executed after every test case
	public void tearDown() {
		
		driver.quit();
		
	}

}
