package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_DeactivateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC002_DeactivateLead";
		testCaseName = "TC002_DeactivateLead";
		testDescription = "Deactivate contact";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String FirstNm,String expectedText,String ConId,String expectedText1 ) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickeleClickContactsTab()
		.clickFindContacts()
		.EnterFirstName(FirstNm)
		.clickfindContactbutton()
		.clickContactid()
		.clickDeactivateContact()
		.VerifyConfirmMsg(expectedText)
		.clickFindContacts()
		.EnterContactid(ConId)
		.clickfindContactbutton()
		.Verfifymsg(expectedText1);
		
		
		
	
		
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
