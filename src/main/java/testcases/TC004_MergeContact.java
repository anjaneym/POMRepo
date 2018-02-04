package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004_MergeContact";
		testCaseName = "TC004_MergeContact";
		testDescription = "Merge Contacts";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String fromid,String Toid,String ConId1,String expectedText1) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickeleClickContactsTab()
		.clickMergeContacts()
		.clickFromContactsimg()
		.entersearchContactId(fromid)
		.clickfindContactsWinbutton()
		.clickfirstresultingConid()
		.clickToContactsimg()
		.enterContactId2(Toid)
		.clickfindContactsWinbutton()
		.clickfirstresultingConid()
		.ClickMergebutton()
		.clickFindContacts()
		.EnterContactid(ConId1)
		.clickfindContactbutton()
		.Verfifymsg(expectedText1);
		
		
		
		
		
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
