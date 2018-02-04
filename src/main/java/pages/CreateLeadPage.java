package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompName;
	public CreateLeadPage enterCompName(String cName) {
		type(eleCompName,cName);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public CreateLeadPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeadPage enterLastName(String lName) {
		type(eleLastName,lName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleEnterPhoneNum;
	public CreateLeadPage enterPhoneNum(String Pno) {
		type(eleEnterPhoneNum,Pno);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEnterEnteremail;
	public CreateLeadPage enterEnteremail(String email) {
		type(eleEnterEnteremail,email);
		return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadbutton;
	public ViewLeadPage ClcikCreateLeadbutton() {
		click(eleCreateLeadbutton);	
		return new ViewLeadPage(driver, test);
	}

	
	
	
	
	
	
	
	
	
	
	

}
