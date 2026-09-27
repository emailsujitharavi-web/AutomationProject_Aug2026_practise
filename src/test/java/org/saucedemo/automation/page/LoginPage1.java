package org.saucedemo.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.saucedemo.automation.utility.ConfigProp;
import org.saucedemo.automation.utility.ScreenShot;
import org.testng.Assert;

public class LoginPage1 {

	
      WebDriver driver;
	
	public LoginPage1(WebDriver driver) 
	{
		this.driver=driver;
	}

	
	public void login_page_verification() throws Exception
	{
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
	    System.out.println(driver.getCurrentUrl());
	    Assert.assertEquals(driver.findElement(By.xpath(ConfigProp.read_element_file("Validation_loginpage_xpath"))).getText(),
	    	    "Swag Labs");
	
	   
	}
	
	public void enter_user_textbox(String name) throws Exception
	{
	
		String actual_result=driver.findElement(By.cssSelector(ConfigProp.read_element_file("Validation_Username_css"))).getAttribute("placeholder");
		
		String expected_result="Username";
		
		System.out.println("Actual:" + actual_result);
		
		Assert.assertEquals(actual_result, expected_result);
		 
		WebElement username_textbox=driver.findElement(By.id(ConfigProp.read_element_file("login_username_id")));
		 
		username_textbox.sendKeys(name);
		
		ScreenShot.testresult(driver, "enter_user_textbox");

		 
	}
	
	public void enter_pass_textbox(String pass) throws Exception
	{
	
	String actual_result=driver.findElement(By.cssSelector(ConfigProp.read_element_file("Validation_Password_css"))).getAttribute("placeholder");
	
	String expected_result="Password";
	
	System.out.println("Actual:" + actual_result);
	
	Assert.assertEquals(actual_result, expected_result);
	 
	WebElement password_textbox=driver.findElement(By.name(ConfigProp.read_element_file("login_password_name")));
	 
	password_textbox.sendKeys(pass);
	
	ScreenShot.testresult(driver, "enter_pass_textbox");

	}
	
	public void click_login() throws Exception
	{
		System.out.println(driver.findElement(By.cssSelector(ConfigProp.read_element_file("Validation_loginbutton_clickable_css"))).isEnabled());
		driver.findElement(By.cssSelector(ConfigProp.read_element_file("Validation_loginbutton_clickable_css"))).click();
		
		ScreenShot.testresult(driver, "click_login");

	}
}
