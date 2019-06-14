package com.capsule.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.capsule.base.TestBaseC;

public class PeoplePageC extends TestBaseC {

	@FindBy(xpath="//a[contains(text(),'Add Person')]")
	WebElement AddPerson;
	

	@FindBy(xpath="//select[@name='party:j_id108:j_id116']")
	WebElement Title;
	
	
	@FindBy(id="party:fnDecorate:fn")
	WebElement fstname;
	
	@FindBy(id="party:lnDecorate:ln")
	WebElement lastname ;
	
	@FindBy(id="party:roleDecorate:jobTitle")
	WebElement JTitle;
	
	@FindBy(id="party:orgDecorate:org")
	WebElement org;
	
	@FindBy(id="party:tagsDecorate:tagComboBox")
	WebElement tags;
	
	@FindBy(id="party:j_id325:0:phnDecorate:number")
	WebElement PhNo;
	
	@FindBy(xpath="//select[@name='party:j_id325:0:phnDecorate:j_id328']")
	WebElement selectPhType;
	
	@FindBy(id="party:j_id342:0:emlDecorate:nmbr")
	WebElement Email;
	
	@FindBy(xpath="//select[@name='party:j_id342:0:emlDecorate:j_id345']")
	WebElement selectmail;
	
	@FindBy(id="party:j_id370:0:webDecorate:web")
	WebElement Website;
	
	@FindBy(id="party:j_id370:0:webDecorate:service")
	WebElement selectNetwork;
	
	
	@FindBy(id="party:save")
	WebElement submit;
	
	@FindBy(xpath="//a[contains(text(),'Jack Jerry')]")
	WebElement personname;
	
	@FindBy(xpath="//a[@aria-label='Cases']")
	WebElement CaseIcon;
	
	@FindBy(xpath="//a[@class='btn-secondary btn-small ember-view']")
	WebElement AddCase;
	
	@FindBy(id="partySearch")
	WebElement partysearch;
		
	@FindBy(xpath="//li[@class='']")
	WebElement expectedname;
	
	@FindBy(id="caseNameDecorate:name")
	WebElement CaseName;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement SaveIcon;
	
	@FindBy(xpath="//div[@class='entity-details-title']")
	WebElement CaseTitle;
	
	@FindBy(xpath="//span[@class='kase-summary-status-open']")
	WebElement CaseStatus;
	
	@FindBy(xpath="//a[@class='ember-view']")
	WebElement CasePersonName;
	
	
	
	public PeoplePageC() throws IOException {
		PageFactory.initElements(driver, this);
	
	}
	
	public void ClickOnAddPersonLink()
	{
		AddPerson.click();
	}
	
	public void AddPersonData(String fname, String lname,String jobtitle,String orgn, 
			String tag,String phtype,String mailtype,String web, String SNetwork)
	

	{
		//Select select=new Select(Title);
		//select.selectByVisibleText(title);
		
		fstname.sendKeys(fname);
		lastname.sendKeys(lname);
		JTitle.sendKeys(jobtitle);
		org.sendKeys(orgn);
		tags.sendKeys(tag);
		//PhNo.sendKeys(phone);
		
		Select phon=new Select(selectPhType);
		phon.selectByVisibleText(phtype);
		
		//Email.sendKeys(email);
		

		Select Emailid=new Select(selectmail);
		Emailid.selectByVisibleText(mailtype);
		
		Website.sendKeys(web);
		selectNetwork.sendKeys(SNetwork);
		
		submit.click();
	}
	

	public boolean VerifyPersonName()
	{
		return personname.isDisplayed();
	}
	
	public void VerifyCase(String name,String cname)
	{
		CaseIcon.click();
		AddCase.click();
		partysearch.sendKeys(name);
		driver.findElement(By.xpath("/html/body/div[5]/ul/li")).click();
		CaseName.sendKeys(cname);
		SaveIcon.click();
		
		 String ct=CaseTitle.getText();
		 Assert.assertEquals(ct, "Daniels");
		 
		 String status=CaseStatus.getText();
		 Assert.assertEquals(status, "Open");
		 
		 String CP=CasePersonName.getText();
		 Assert.assertEquals(CP, "Jack Jerry");
		 CaseIcon.click();	
	}
	
	
	
	
	
	
	
}
