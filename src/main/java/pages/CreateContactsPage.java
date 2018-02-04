package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateContactsPage extends ProjectMethods{
	
	public CreateContactsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.ID,using="firstNameField")
	private WebElement eleFirstName;
	public CreateContactsPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	@FindBy(how=How.ID,using="lastNameField")
	private WebElement eleLastName;
	public CreateContactsPage enterLastName(String lName) {
		type(eleLastName,lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_firstNameLocal")
	private WebElement eleEnterFirstLocName;
	public CreateContactsPage enterFirstLocName(String fln) {
		type(eleEnterFirstLocName,fln);
		return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_lastNameLocal")
	private WebElement eleEnterLastLocName;
	public CreateContactsPage enterLastLocName(String lloc) {
		type(eleEnterLastLocName,lloc);
		return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_personalTitle")
	private WebElement eleEnterSalutation;
	public CreateContactsPage enterSalutation(String sal) {
		type(eleEnterSalutation,sal);
		return this;
	}
	@FindBy(how=How.ID,using="createContactForm_generalProfTitle")
	private WebElement eleEnterTitle;
	public CreateContactsPage entertitle(String tit) {
		type(eleEnterTitle,tit);
		return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_departmentName")
	private WebElement eleEnterDepName;
	public CreateContactsPage enterDepName(String Dname) {
		type(eleEnterDepName,Dname);
		return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_preferredCurrencyUomId")
	private WebElement eleSelCCY;
	public CreateContactsPage SelCCY(String CCY) {
		selectDropDownUsingText(eleSelCCY, CCY);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_description")
	private WebElement eleDesc;
	public CreateContactsPage EnterDesc(String des) {
		type(eleDesc, des);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_importantNote")
	private WebElement eleImpNote;
	public CreateContactsPage EnterImpNote(String ImpNote) {
		type(eleImpNote, ImpNote);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneAreaCode")
	private WebElement eleAreaCode;
	public CreateContactsPage EnterAreaCode(String code) {
		type(eleAreaCode, code);
			return this;
	}
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneExtension")
	private WebElement eleExtension;
	public CreateContactsPage EnterExtension(String Ext) {
		type(eleExtension, Ext);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneNumber")
	private WebElement elePNUM;
	public CreateContactsPage EnterPNUM(String PNO) {
		type(elePNUM, PNO);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_primaryEmail")
	private WebElement eleEmail;
	public CreateContactsPage EnterEmail(String EML) {
		type(eleEmail, EML);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_primaryPhoneAskForName")
	private WebElement elePersonToAsk;
	public CreateContactsPage EnterPersonToAsk(String Pask) {
		type(elePersonToAsk, Pask);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_generalAddress1")
	private WebElement eleAddLine1;
	public CreateContactsPage EnterAddLine1(String AdLine1) {
		type(eleAddLine1, AdLine1);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_generalCity")
	private WebElement eleCityName;
	public CreateContactsPage EnterCityName(String CitNm) {
		type(eleCityName, CitNm);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_generalPostalCode")
	private WebElement elePostCd;
	public CreateContactsPage EnterPostCd(String Pcd) {
		type(elePostCd, Pcd);
			return this;
	}
	@FindBy(how=How.ID,using="createContactForm_generalPostalCodeExt")
	private WebElement elePostCdEx;
	public CreateContactsPage EnterPostCdEx(String Pcdex) {
		type(elePostCdEx, Pcdex);
			return this;
	}
	@FindBy(how=How.ID,using="createContactForm_generalAttnName")
	private WebElement eleAttnName;
	public CreateContactsPage EnterAttnName(String AttName) {
		type(eleAttnName, AttName);
			return this;
	}
	@FindBy(how=How.ID,using="createContactForm_generalCountryGeoId")
	private WebElement eleCountryCd;
	public CreateContactsPage SelCountryCd(String countycd) throws Exception {
		selectDropDownUsingText(eleCountryCd, countycd);
		Thread.sleep(3000);
			return this;
	}
	
	@FindBy(how=How.ID,using="createContactForm_generalStateProvinceGeoId")
	private WebElement eleState;
	public CreateContactsPage SelectState(String state) {
		selectDropDownUsingText(eleState, state);
			return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateContactbutton;
	public ViewContactPage ClcikCreateContactbutton() {
		click(eleCreateContactbutton);	
		return new ViewContactPage(driver, test);
	}

	
	
	
	
	
	
	
	
	
	
	

}
