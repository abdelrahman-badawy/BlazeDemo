package com.BlazeDemo.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Blaze.base.Base;

public class Utils extends Base {

	public Utils() throws IOException {
		super();
	}
	
	public static void takeSnapshot(String name) throws IOException {
		
		File image = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(image, new File ("Snapshots/" + name + ".png"));
		String fullPath = System.getProperty("user.dir") + File.separator + "Snapshots/" + name + ".png";
	}

}
