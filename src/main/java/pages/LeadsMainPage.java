package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class LeadsMainPage extends ProjectMethods{
	
	public LeadsMainPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	public CreateLeadPage clickCreateLeads() {
		click(eleCreateLead);
		return new CreateLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement elefindleads;
	public FindLeadPage clickfindleads() {
		click(elefindleads);
		return new FindLeadPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeleads;
	public MergeLeadsPage clickMergeLeadstab() {
		click(eleMergeleads);
		return new MergeLeadsPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	

}
