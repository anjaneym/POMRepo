package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsWindowPage extends ProjectMethods{
	
	public MergeLeadsWindowPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-form-text x-form-field')])[1]")
	private WebElement elesearchLeadId;
	public MergeLeadsWindowPage entersearchLeadId(String fromid) {
		type(elesearchLeadId,fromid);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-form-text x-form-field')])[1]")
	private WebElement elesearchLeadId2;
	public MergeLeadsWindowPage entersearchLeadId2(String Toid) {
		type(elesearchLeadId2,Toid);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//*[contains(@class,'x-btn-text')])[1]")
	private WebElement eleclickfindWinleadsbutton;
	public MergeLeadsWindowPage clickfindleadsWinbutton() throws Exception {
		click(eleclickfindWinleadsbutton);
		Thread.sleep(5000);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleclickfirstresultingid;
	public MergeLeadsPage clickfirstresultingid(){
		click(eleclickfirstresultingid);
		switchToWindow(0);
		return new MergeLeadsPage(driver, test);
	}

	
	
	
	
	
	
	
	
	
	
	

}
