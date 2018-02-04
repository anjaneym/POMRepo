package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_DuplicateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC006";
		testCaseName = "TC006_DuplicateLead";
		testDescription = "To create duplicate record";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String Email) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickLeadsTab()
		.clickfindleads()
		.clickEmailIdTab()
		.EnterEmailId(Email)
		.clickfindleadsbutton()
		.clickleadid()
		.clickDuplicateLead()
		.clickDuplicateLeadbutton();
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
