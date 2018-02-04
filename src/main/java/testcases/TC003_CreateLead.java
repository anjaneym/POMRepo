package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Perform Create Lead";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String cName,String fName,String lName,String Pno,String email){
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickLeadsTab()
		.clickCreateLeads()
		.enterCompName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterPhoneNum(Pno)
		.enterEnteremail(email)
		.ClcikCreateLeadbutton()
		.VerifycNameText(cName);
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
