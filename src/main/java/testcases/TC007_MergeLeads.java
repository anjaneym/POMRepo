package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_MergeLeads extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC007";
		testCaseName = "TC007_MergeLeads";
		testDescription = "Merge records";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String fromid,String Toid) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickLeadsTab()
		.clickMergeLeadstab()
		.clickFromLeadsimg()
		.entersearchLeadId(fromid)
		.clickfindleadsWinbutton()
		.clickfirstresultingid()
		.clickToLeadsimg()
		.entersearchLeadId2(Toid)
		.clickfirstresultingid()
		.ClickMergebutton();
		
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
