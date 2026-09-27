package org.saucedemo.automation.utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


	public class ScreenShot
	{

		public static void testresult(WebDriver driver, String name) throws Exception
		{
			TakesScreenshot ts = (TakesScreenshot) driver;   //take the screenshot
			
			File f = ts.getScreenshotAs(OutputType.FILE);
			
			File fd = new File("./screenshot/sprint/" + name + ".png");
			
			FileUtils.copyFile(f, fd);
		}
		
	}


