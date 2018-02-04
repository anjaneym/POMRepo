package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindContactPage extends ProjectMethods{
	
	public FindContactPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	public FindContactPage EnterFirstName(String FirstNm) {
		type(eleFirstName, FirstNm);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//label[text()='Contact Id:']/following::input[1]")
	private WebElement eleContactid;
	public FindContactPage EnterContactid(String ConId) {
		type(eleContactid, ConId);
		return this;
	}
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elephonetab;
	public FindContactPage clickphonetab() {
		click(elephonetab);
		return this;
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement eleenterno;
	public FindContactPage enterPhonenum(String pno1) {
		type(eleenterno, pno1);
		return this;
	}

	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailIdTab;
	public FindContactPage clickEmailIdTab() {
		click(eleEmailIdTab);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEnterEmailId;
	public FindContactPage EnterEmailId(String Email) {
		type(eleEnterEmailId,Email);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Contacts']")
	private WebElement elefindContactsbutton;
	public FindContactPage clickfindContactbutton() throws Exception {
		click(elefindContactsbutton);
		Thread.sleep(5000);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement elcontactid;
	public ViewContactPage clickContactid() {
		click(elcontactid);
		return new ViewContactPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='x-paging-info']")
	private WebElement eleVerifymsg;
	public FindContactPage Verfifymsg(String expectedText1) {
		verifyExactText(eleVerifymsg, expectedText1);
				return new FindContactPage(driver, test);
	}
	
	
	
	
	
	

}
