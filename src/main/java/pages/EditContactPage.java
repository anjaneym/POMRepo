package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditContactPage extends ProjectMethods{
	
	public EditContactPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.ID,using="updateContactForm_firstName")
	private WebElement eleChangeFstNm;
	public EditContactPage ChangeFstNm(String FirstNm1) {
		
		type(eleChangeFstNm,FirstNm1);
		return this;
	}

	@FindBy(how=How.XPATH,using="(//input[@class='smallSubmit'])[1]")
	private WebElement eleUpdateButton;
	public ViewContactPage clickUpdateButton() {
		click(eleUpdateButton);
		return new ViewContactPage(driver, test);
	}

	
	
	
	
	
	

}
