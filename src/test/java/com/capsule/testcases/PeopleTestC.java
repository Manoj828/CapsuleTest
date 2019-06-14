package com.capsule.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.capsule.base.TestBaseC;
import com.capsule.pages.HomePageC;
import com.capsule.pages.LoginPageC;
import com.capsule.pages.PeoplePageC;
import com.capsule.utils.TestUtilC;


public class PeopleTestC extends TestBaseC {

	 HomePageC homepage;
     LoginPageC loginpage;
     PeoplePageC peoplepage;
     String sheetName= "PersonData";

	public PeopleTestC() throws IOException {
		super();
		
	}

	@BeforeMethod()
	public void setup() throws IOException
	{
		initialisation();
		peoplepage=new PeoplePageC();
		loginpage=new LoginPageC();
	    homepage=loginpage.VerifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		peoplepage=homepage.ClickOnPeopleLink();
		peoplepage.ClickOnAddPersonLink();
	}
	
	
/*	@DataProvider()
	public Object[][] GetLoginData() throws IOException
	{
		Object data[][]=TestUtilC.GetTestData(sheetName);
		return data;
	}
	
	@Test(priority=1, dataProvider="GetLoginData")
	public void AddPersonTest(String firstname, String lastname,String Jobtitle,String Orgn, 
			String Tag,String PhType,String EmailType,String Web, String Snetwork) throws IOException, InterruptedException
	{
		peoplepage.AddPersonData(firstname,lastname, Jobtitle, Orgn, Tag, PhType, EmailType, Web, Snetwork);
		Thread.sleep(3000);
		peoplepage=homepage.ClickOnPeopleLink(); 
		Boolean flag=peoplepage.VerifyPersonName();
		Assert.assertTrue(flag,"Name is not Displayed");
		System.out.println("Test Success"); 
	    peoplepage.VerifyCase("jack", "Daniels");
	    System.out.println("Test Success");    
	} */
	
	@Test()
	public void jenkinsdemo()
	{
		System.out.println("Jenkinsdemo");
	}
	
	
	
	@AfterMethod()
	public void tearup()
	{
		
		driver.quit();
	}
}