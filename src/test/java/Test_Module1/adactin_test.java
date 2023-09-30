package Test_Module1;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import LibraryFile.base_class;
import LibraryFile.utilityclass;
import Module1.adactin_home;
import Module1.adctinlogin;
import pom_ddf_testNG_baseClass_utilityClass.Actin_homepage;
import pom_ddf_testNG_baseClass_utilityClass.AdactinLogin;
import pom_ddf_testNG_baseClass_utilityClass.UtilityClass;

public class adactin_test extends base_class {
	// create object of pom class1
             	adctinlogin login;
				// create object of pom class2
				
				adactin_home home;
				
				String TestCaseId;
				
		@BeforeClass
		public void openbrowser()
		{
			initilizebrowser();
			
			// create object of pom Class I
			login=new adctinlogin(driver);
			// create object of pom Class II
			home=new adactin_home(driver);
			}
		@BeforeMethod
		public void loginToapp() throws IOException
		
		{
			
			// Enter user name
		 login.enterusername(UtilityClass.getdatafrompf("User"));
		
		// EnterPassword
			 login.enterpassword(UtilityClass.getdatafrompf("Password"));
			 
			 // click Login button
			 
			 login.Clickloginbtn();
		}
		
		@Test(priority=1)
		public void Verifyusername() throws IOException
		{
			
			TestCaseId="100";
		String 	ActualUserName=home.getusername();
		
		// excepted un
		String ExceptedUserName=utilityclass.getdataFromExcelSheet(6, 0);
		
			
		}
		
		@Test(priority=2)
		public void getTitleofapp() throws IOException
		
		{
			TestCaseId="101";
			String ActualTitle=driver.getTitle();
			
			String ExceptedTitle=utilityclass.getdataFromExcelSheet(7, 0);
			
			Assert.assertEquals(ActualTitle, ExceptedTitle);
		}
		
		@Test(priority=3)
		public void BookHotel() throws IOException
		{
			TestCaseId="102";
			
			home.SelectLocation(utilityclass.getdataFromExcelSheet(0,2));
			home.SelectHotels(utilityclass.getdataFromExcelSheet(1,2));
			home.SelectRoomType(utilityclass.getdataFromExcelSheet(2,2));
			home.SelectNumberOfRooms1(utilityclass.getdataFromExcelSheet(3,2));
			home.EnterCheckinDate(utilityclass.getdataFromExcelSheet(4,2));
			home.EnterCheckoutdate(utilityclass.getdataFromExcelSheet(5,2));
			home.SelectAdultsperRoom(utilityclass.getdataFromExcelSheet(6,2));
			home.SelectChildperRoom(utilityclass.getdataFromExcelSheet(7,2));
			home.ClickSearchBTN();
			
			home.ClickRadioBTN();
			home.ClickContinueBTN();
			
			home.EnterFirstName(utilityclass.getdataFromExcelSheet(0,3));
			home.EnterLastName(utilityclass.getdataFromExcelSheet(1,3));
			home.EnterBillingAddress(utilityclass.getdataFromExcelSheet(2,3));
			home.EnterCCN(utilityclass.getdataFromExcelSheet(3,3));
            home.EnterCCT(utilityclass.getdataFromExcelSheet(4,3));
            home.SelectEDMonth(utilityclass.getdataFromExcelSheet(5,3));
            home.SelectEDYear(utilityclass.getdataFromExcelSheet(6,3));
            home.EnterCVV(utilityclass.getdataFromExcelSheet(7,3));
            home.ClickBooknowBTN();
			
		}

		@AfterMethod
		public void logout(ITestResult Result) throws IOException
		{
			if(Result.getStatus()==ITestResult.FAILURE)
			{
				utilityclass.CaptureSchreenShot(driver, TestCaseId);
			}
			home.logout();
			home.againlogin();
		}
		
		@AfterClass
		public void closeBrowser()
		{
             driver.close();		
             }
		

}
