package com.capsule.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.capsule.base.TestBaseC;

public class AccountPageC extends TestBaseC {

	
	 @FindBy(xpath="//a[contains(text(),'Account')]") 
	 WebElement AccLink;
	 
	 @FindBy(xpath="//h1[contains(text(),'Account')]") 
	 WebElement AccTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Invoices')]") 
	 WebElement InvoicesLink;
	
	 @FindBy(xpath="//a[contains(text(),'Invoices')]") 
	 WebElement InvoicesTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Appearance')]") 
	 WebElement AppearanceLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Appearance')]") 
	 WebElement AppearanceTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Mail Drop Box')]") 
	 WebElement MailLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Mail Drop Box')]") 
	 WebElement MailTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Users')]") 
	 WebElement UsersLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Users')]") 
	 WebElement UsersTitle;
	 
	 //to create new user
	 @FindBy(xpath="//a[contains(text(),'Add new User')]") 
	 WebElement AddNewUserIcon;
	 
	 @FindBy(xpath="//input[@id='register:firstnameDecorate:firstName']") 
	 WebElement NewUserFname;
	 
	 @FindBy(xpath="//input[@id='register:lastNameDecorate:lastName']") 
	 WebElement NewUserLname;
	 
	 @FindBy(xpath="//input[@id='register:emailDecorate:email']") 
	 WebElement NewUserEmail;
	 
	 @FindBy(xpath="//input[@id='register:usernameDecorate:username']") 
	 WebElement NewUserName;
	 
	 @FindBy(xpath="//input[@id='register:save']") 
	 WebElement NewUserSaveButton;
	 //====== user creation done ========//
	 
	 @FindBy(xpath="//a[contains(text(),'Opportunities')]") 
	 WebElement OpportunitiesLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Opportunities')]") 
	 WebElement OpportunitiesTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Tracks')]") 
	 WebElement TracksLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Tracks')]") 
	 WebElement TracksTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Task Categories')]") 
	 WebElement TaskLink;
	
	 @FindBy(xpath="//a[contains(text(),'Task Categories')]") 
	 WebElement TaskTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Integrations')]") 
	 WebElement IntegrationsLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Integrations')]") 
	 WebElement IntegrationsTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Tags')]") 
	 WebElement TagsLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Tags')]") 
	 WebElement TagsTitle;
	 
	 @FindBy(xpath="//a[contains(text(),'Trash')]") 
	 WebElement TrashLink;
	 
	 @FindBy(xpath="//a[contains(text(),'Trash')]") 
	 WebElement TrashTitle; 
	 
	 @FindBy(xpath="//a[contains(text(),'Configure')]") 
	 WebElement ConfigureIcon; 
	 
	  
	public AccountPageC() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	public boolean VerifyAccountLink() throws InterruptedException
	{
		//AccLink.click();
		Thread.sleep(5000);
	    return AccTitle.isDisplayed();
	}
	
	
	public boolean VerifyInvoiveLink()
	{
		InvoicesLink.click();
	    return InvoicesTitle.isDisplayed();
	}
	
	
	public boolean VerifyAppearanceLink()
	{
		AppearanceLink.click();
	    return AppearanceTitle.isDisplayed();
	}
	
	public boolean VerifyMailLink()
	{
		MailLink.click();
	    return MailTitle.isDisplayed();
	}
	
	public boolean VerifyUsersLink()
	{
		UsersLink.click();
	    return UsersTitle.isDisplayed();
	}
	
	public boolean VerifyOpportunitiesLink()
	{
		OpportunitiesLink.click();
	    return OpportunitiesTitle.isDisplayed();
	}
	
	public boolean VerifyTracksLink()
	{
		TracksLink.click();
	    return TracksTitle.isDisplayed();
	}
	
	public boolean VerifyTaskLink()
	{
		TaskLink.click();
	    return TaskTitle.isDisplayed();
	}
	
	public boolean VerifyIntegrationsLink()
	{
		IntegrationsLink.click();
	    return IntegrationsTitle.isDisplayed();
	}
	
	public boolean VerifyTagsLink()
	{
		TagsLink.click();
	    return TagsTitle.isDisplayed();
	}
	

	public boolean VerifyTrashLink()
	{
		TrashLink.click();
	    return TrashTitle.isDisplayed();
	}
	
	public void AddNewUser(String FN, String LN, String Email,String UName )
	{
		AddNewUserIcon.click();
		NewUserFname.sendKeys(FN);
		NewUserLname.sendKeys(LN);
		NewUserEmail.sendKeys(Email);
		NewUserName.sendKeys(UName);
		NewUserSaveButton.click();
	
	
  }
	
	public  int VerifyConfigureIcons()
	{
		IntegrationsLink.click();
	 int list=driver.findElements(By.xpath("//a[contains(text(),'Configure')]")).size();
	 System.out.println("Total Number Of Configure buttons: " +list);
	 return list;
	 
	}
	
}
