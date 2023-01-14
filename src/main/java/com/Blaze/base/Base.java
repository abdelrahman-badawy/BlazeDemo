package com.Blaze.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;

	
	public Base() throws IOException {
		
		PageFactory.initElements(driver, this);
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\abdelrahman.badwy\\eclipse-workspace\\BlazeDemo\\src\\main\\java\\com\\BlazeDemo\\config\\config.properties");
		prop.load(fis);
	}
	
	public void initialization(String URL) {
		
		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	

}
