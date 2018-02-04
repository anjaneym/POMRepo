package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateContact extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC001_CreateContact";
		testCaseName = "TC001_CreateContact";
		testDescription = "Create a contact";
		category= "Smoke";
		authors	="Anjan";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord,String fName,String lName,String fln, String lloc,String sal,String tit,String Dname, String CCY,String des,String ImpNote,
			String code, String Ext,String PNO,String EML,String Pask, String AdLine1,String CitNm,String Pcd,
			String Pcdex, String AttName,String countycd,String state,String expectedText) throws Exception{
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickcrmfsa()
		.clickeleClickContactsTab()
		.clickCreateContact()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterFirstLocName(fln)
		.enterLastLocName(lloc)
		.enterSalutation(sal)
		.entertitle(tit)
		.enterDepName(Dname)
		.SelCCY(CCY)
		.EnterDesc(des)
		.EnterImpNote(ImpNote)
		.EnterAreaCode(code)
		.EnterExtension(Ext)
		.EnterPNUM(PNO)
		.EnterEmail(EML)
		.EnterPersonToAsk(Pask)
		.EnterAddLine1(AdLine1)
		.EnterCityName(CitNm)
		.EnterPostCd(Pcdex)
		.EnterPostCdEx(Pcdex)
		.EnterAttnName(AttName)
		.SelCountryCd(countycd)
		.SelectState(state)
		.ClcikCreateContactbutton()
		.VerifyConfirmMsg(expectedText);
		
		
		
		
	
		
	
		
		
		
		
		
		
						
		
		
		
		
		
		
		
		
		
	}

}
