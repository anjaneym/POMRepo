package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_DeleteLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_DeleteLead";
		testDescription = "To delete lead";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String pno1) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickLeadsTab()
		.clickfindleads()
		.clickphonetab()
		.enterPhonenum(pno1)
		.clickfindleadsbutton()
		.clickleadid()
		.clickdeletelead();
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
