package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadPage extends ProjectMethods{
	
	public FindLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elephonetab;
	public FindLeadPage clickphonetab() {
		click(elephonetab);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleenterno;
	public FindLeadPage enterPhonenum(String pno1) {
		type(eleenterno, pno1);
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailIdTab;
	public FindLeadPage clickEmailIdTab() {
		click(eleEmailIdTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEnterEmailId;
	public FindLeadPage EnterEmailId(String Email) {
		type(eleEnterEmailId,Email);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement elefindleadsbutton;
	public FindLeadPage clickfindleadsbutton() throws Exception {
		click(elefindleadsbutton);
		Thread.sleep(5000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleleadid;
	public ViewLeadPage clickleadid() {
		click(eleleadid);
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	

}
