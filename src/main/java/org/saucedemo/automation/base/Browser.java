package org.saucedemo.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.rediff.automation.utilities.ConfigDataProperties;
import org.saucedemo.automation.utility.ConfigProp;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Browser {

public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		if(ConfigProp.read_Config_file("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ConfigProp.read_Config_file("BrowserName").equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		
		else if(ConfigProp.read_Config_file("BrowserName").equalsIgnoreCase("Safari"))
		{
			driver = new SafariDriver();
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ConfigProp.read_Config_file("ApplicationURL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
}


