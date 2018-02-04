package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_EditLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC005";
		testCaseName = "TC005_DeleteLead";
		testDescription = "To edit company name";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String Email,String compN1) throws Exception{
		
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
		.clickEditlead()
		.clearcomnamefield(compN1)
		.clickUpdateButton();
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
