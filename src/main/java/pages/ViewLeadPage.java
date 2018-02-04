package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.VerifyException;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{
	
	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleComNamText;
	public ViewLeadPage VerifycNameText(String expectedText) {
		verifyPartialText(eleComNamText, expectedText);
		
		return this;
	}

	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eledeletelead;
	public ViewLeadPage clickdeletelead() {
		click(eledeletelead);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditlead;
	public EditLeadPage clickEditlead() {
		click(eleEditlead);
		return new EditLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateLead;
	public DuplicateLeadPage clickDuplicateLead() {
		click(eleDuplicateLead);
		return new DuplicateLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	

}
