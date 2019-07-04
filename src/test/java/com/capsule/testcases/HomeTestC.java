package com.capsule.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.capsule.base.TestBaseC;
import com.capsule.pages.HomePageC;
import com.capsule.pages.LoginPageC;
import com.capsule.pages.PeoplePageC;

public class HomeTestC extends TestBaseC {
	
       HomePageC homepage;
       LoginPageC loginpage;
       PeoplePageC peoplepage;

	public HomeTestC() throws IOException {
		super();
		
	}

	@BeforeMethod()
	public void setup() throws IOException
	{
		initialisation();
	    loginpage=new LoginPageC();
	    homepage=loginpage.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test()
	public void ClickOnPeopleLinkTest() throws IOException
	{
		peoplepage=homepage.ClickOnPeopleLink();
	}
	
	
	@Test()
	public void AccountLinkTest() throws IOException
	{
		homepage.ClickOnAccountLink();
		
	}
	
	
	
	@AfterMethod()
	public void tearup()
	{
		// driver.quit();
	}
	
	
	
	
	
}
