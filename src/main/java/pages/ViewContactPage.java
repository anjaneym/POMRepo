package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.VerifyException;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewContactPage extends ProjectMethods{
	
	public ViewContactPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Deactivate Contact")
	private WebElement eleDeactivateContact;
	public ViewContactPage clickDeactivateContact() {
		click(eleDeactivateContact);
		acceptAlert();
		return this;
	}
	@FindBy(how=How.ID,using="viewContact_firstName_sp")
	private WebElement eleConfirmMsg;
	public ViewContactPage VerifyConfirmMsg(String expectedText) {
		verifyPartialText(eleConfirmMsg, expectedText);
		
		return this;
	}
	
	@FindBy(how=How.ID,using="viewContact_fullName_sp")
	private WebElement eleVerifyExactName;
	public ViewContactPage VerifyExactName(String expectedText) {
		verifyExactText(eleVerifyExactName, expectedText);
		
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleFindContacts;
	public FindContactPage clickFindContacts() {
		click(eleFindContacts);
		return new FindContactPage(driver, test);
	}
		
	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditContact;
	public EditContactPage clickEditContact() {
		click(eleEditContact);
		return new EditContactPage(driver, test);
	}

	


}
