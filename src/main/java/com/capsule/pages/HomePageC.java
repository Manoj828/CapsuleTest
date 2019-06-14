package com.capsule.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBaseC;

public class HomePageC extends TestBaseC {

	
	@FindBy(xpath="//a[@aria-label='People & Organisations']")
	WebElement peoplelink;
	
	 @FindBy(xpath="//span[@class='nav-bar-account-name']")
	 WebElement AccountLink;

	 @FindBy(xpath="//a[contains(text(),'Account Settings')]")
	 WebElement AccountSettingMenu;
	
	public HomePageC() throws IOException
	{
		PageFactory.initElements(driver, this);
	}
	
	public PeoplePageC ClickOnPeopleLink() throws IOException
	{
		peoplelink.click();
		return new PeoplePageC();
	}
	
	public AccountPageC ClickOnAccountLink() throws IOException
	{
		AccountLink.click();
		AccountSettingMenu.click();
		return new AccountPageC();
	}
}
