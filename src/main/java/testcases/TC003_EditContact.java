package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_EditContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003_EditContact";
		testCaseName = "TC003_EditContact";
		testDescription = "Edit the contact";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String FirstNm,String FirstNm1,String expectedText) throws Exception{
		
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
		.clickEditContact()
		.ChangeFstNm(FirstNm1)
		.clickUpdateButton()
		.VerifyExactName(expectedText);
		
		
		
	
		
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
