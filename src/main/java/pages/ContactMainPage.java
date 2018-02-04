package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ContactMainPage extends ProjectMethods{
	
	public ContactMainPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Contact")
	private WebElement eleCreateContact;
	public CreateContactsPage clickCreateContact() {
		click(eleCreateContact);
		return new CreateContactsPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleFindContacts;
	public FindContactPage clickFindContacts() {
		click(eleFindContacts);
		return new FindContactPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Contacts")
	private WebElement eleMergeContacts;
	public MergeContactPage clickMergeContacts() {
		click(eleMergeContacts);
		return new MergeContactPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	

}
