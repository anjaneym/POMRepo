package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	
	public MergeLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFromLeadsimg;
	public MergeLeadsWindowPage clickFromLeadsimg() {
		click(eleFromLeadsimg);
		switchToWindow(1);
		return new MergeLeadsWindowPage(driver, test);
	}
	
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleToLeadsimg;
	public MergeLeadsWindowPage clickToLeadsimg() {
		click(eleToLeadsimg);
		switchToWindow(1);
		return new MergeLeadsWindowPage(driver, test);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleClickMergebutton;
	public MergeLeadsPage ClickMergebutton() {
		click(eleClickMergebutton);
		acceptAlert();
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
