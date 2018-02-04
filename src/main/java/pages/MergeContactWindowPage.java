package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeContactWindowPage extends ProjectMethods{
	
	public MergeContactWindowPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-form-text x-form-field')])[1]")
	private WebElement elesearchContactId;
	public MergeContactWindowPage entersearchContactId(String fromid) {
		type(elesearchContactId,fromid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-form-text x-form-field')])[1]")
	private WebElement elesearchContactId2;
	public MergeContactWindowPage enterContactId2(String Toid) {
		type(elesearchContactId2,Toid);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-btn-text')])[1]")
	private WebElement eleclickfindWinContactbutton;
	public MergeContactWindowPage clickfindContactsWinbutton() throws Exception {
		click(eleclickfindWinContactbutton);
		Thread.sleep(5000);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement elefirstresultingContid;
	public MergeContactPage clickfirstresultingConid(){
		click(elefirstresultingContid);
		switchToWindow(0);
		return new MergeContactPage(driver, test);
	}

	
	
	
	
	
	
	
	
	
	
	

}
