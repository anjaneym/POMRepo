package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeadPage extends ProjectMethods{
	
	public EditLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement elecomnamefield;
	public EditLeadPage clearcomnamefield(String compN1) {
		
		type(elecomnamefield,compN1);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateButton;
	public EditLeadPage clickUpdateButton() {
		click(eleUpdateButton);
		return this;
	}

	
	
	
	
	
	

}
