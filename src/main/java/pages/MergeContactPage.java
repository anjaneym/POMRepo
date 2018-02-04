package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeContactPage extends ProjectMethods{
	
	public MergeContactPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromContactsimg;
	public MergeContactWindowPage clickFromContactsimg() {
		click(eleFromContactsimg);
		switchToWindow(1);
		return new MergeContactWindowPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToContactsimg;
	public MergeContactWindowPage clickToContactsimg() {
		click(eleToContactsimg);
		switchToWindow(1);
		return new MergeContactWindowPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleClickMergebutton;
	public MergeContactPage ClickMergebutton() {
		click(eleClickMergebutton);
		acceptAlert();
		return this;
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Contacts")
	private WebElement eleFindContacts;
	public FindContactPage clickFindContacts() {
		click(eleFindContacts);
		return new FindContactPage(driver, test);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
