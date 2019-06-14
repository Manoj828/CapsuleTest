package com.capsule.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsule.base.TestBaseC;
import com.capsule.pages.AccountPageC;
import com.capsule.pages.HomePageC;
import com.capsule.pages.LoginPageC;
import com.capsule.utils.TestUtilC;

public class AccountTestC extends TestBaseC {
 
	AccountPageC accountpage;
	LoginPageC loginpage;
	HomePageC homepage;
	
	String sheetName= "AccNewUserData";
	public AccountTestC() throws IOException {
		super();
		
	}

	@BeforeMethod()
	public void setup() throws IOException
	{
		initialisation();
	    accountpage=new AccountPageC();
	    loginpage = new LoginPageC();
	    homepage=loginpage.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	    homepage.ClickOnAccountLink();
	}
	
	
/*	@Test()
	public void AccountLinkTest() throws InterruptedException
	{
		Assert.assertTrue(accountpage.VerifyAccountLink());
		System.out.println("test pass");
	} 
	
	@Test()
	public void InvoiceLinkTest()
	{
		Assert.assertTrue(accountpage.VerifyInvoiveLink());
		System.out.println("test pass");
	}
	
	@DataProvider()
	public Object[][] GetTestData() throws IOException
	{
		Object data[][]=TestUtilC.GetTestData(sheetName);
		return data;
	}
	
	
	@Test(dataProvider="GetTestData")
	public void AddNewUserTest(String FirstName, String LastName,String EMail, String UserName )
	{
		Assert.assertTrue(accountpage.VerifyUsersLink());
		System.out.println("test pass");
		
		accountpage.AddNewUser(FirstName, LastName, EMail, UserName); 
		
	} */
	
	@Test
	public void ConfigureIconTest()
	{
		int total=accountpage.VerifyConfigureIcons();
		Assert.assertEquals(total, 12);
	}
	
	
	  
	
	}
