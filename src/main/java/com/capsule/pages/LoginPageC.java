package com.capsule.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBaseC;

public class LoginPageC extends TestBaseC {

	
	@FindBy(xpath="//input[@id='login:usernameDecorate:username']")
	WebElement user;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	

	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	public LoginPageC() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public HomePageC VerifyLogin(String username,String password) throws IOException
	{
		user.sendKeys(username);
		pwd.sendKeys(password);
		submit.click();
		return new HomePageC();
	}
	
	
	
	
}
