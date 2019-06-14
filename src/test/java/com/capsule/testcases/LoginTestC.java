package com.capsule.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.base.TestBaseC;
import com.capsule.pages.HomePageC;
import com.capsule.pages.LoginPageC;

public class LoginTestC extends TestBaseC {

	LoginPageC loginpage;
	HomePageC homepage;
	
	public LoginTestC() throws IOException {
		super();
		
	}

	@BeforeMethod()
	public void setup() throws IOException
	{
		initialisation();
	    loginpage=new LoginPageC();
		
	}
	
	
	@Test()
	public void LoginTest() throws IOException
	{
		homepage=loginpage.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod()
	public void tearup()
	{
		
	}
	
}
