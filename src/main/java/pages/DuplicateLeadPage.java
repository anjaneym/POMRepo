package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.VerifyException;
import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
		
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleDuplicateLeadbutton;
	public ViewLeadPage clickDuplicateLeadbutton() {
		click(eleDuplicateLeadbutton);
		return new ViewLeadPage(driver, test);
	}
	
	
	
	
	
	
	
	
	

}
