package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
	
	public MyHomePage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeadsTab;
	public LeadsMainPage clickLeadsTab() {
		click(eleLeadsTab);
		return new LeadsMainPage(driver, test);
	}

	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
	public FindLeadPage clickFindLeads() {
		click(eleFindLeads);
		return new FindLeadPage(driver, test);

	}
	
	@FindBy(how=How.LINK_TEXT,using="Contacts")
	private WebElement eleClickContactsTab;
	public ContactMainPage clickeleClickContactsTab() {
		click(eleClickContactsTab);
		return new ContactMainPage(driver, test);

	}
	
	
	

}
