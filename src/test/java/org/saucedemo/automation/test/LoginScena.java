package org.saucedemo.automation.test;


import org.saucedemo.automation.base.Browser;
import org.saucedemo.automation.page.LoginPage1;
import org.testng.annotations.Test;


	
	public class LoginScena extends Browser
	{

		@Test
		public void login_functionality_valid_credential() throws Exception
		{
			LoginPage1 login1 = new LoginPage1(driver);
			login1.login_page_verification();
			login1.enter_user_textbox("standard_user");
			login1.enter_pass_textbox("secret_sauce");
			login1.click_login();
			
		
		}
		
	}

