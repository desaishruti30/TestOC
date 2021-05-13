package OpenCartTestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartPages.DataInsertAndSubmitRegiPage;
import OpenCartPages.RegiSuccessPage;
import OpenCartUtil.TestUtil;

import java.io.IOException;

import org.apache.http.cookie.SM;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.log4testng.Logger;



public class VerifySuccessfullRegiTest extends TestBase {
	
	RegiSuccessPage regiSuccessPage;
	TestUtil testUtil;
	DataInsertAndSubmitRegiPage dataInsertAndSubmitRegiPage;
	
	String sheetName = "RegiPage";
	
	 
	public VerifySuccessfullRegiTest(){
		super();
	}
	
	
	
@BeforeMethod //initialization 
	
	public void initialization() throws InterruptedException{
		initialize();
		testUtil = new TestUtil();
		dataInsertAndSubmitRegiPage  =new DataInsertAndSubmitRegiPage();
		regiSuccessPage = new RegiSuccessPage();
		//testUtil.switchToFrame();
		
		}
	
	
	
	 @Test (priority= 1)
	 		public void SuccessRegiPagelabelTest(){
		 	String Heading = regiSuccessPage.verifySuccessRegiPageTitle();
		 	Assert.assertTrue(dataInsertAndSubmitRegiPage.verifypageLabel(), "Register Account");
		 	//Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
		}
	 		
	
	 @DataProvider
			public Object[][] getOpenCartTestData(){
			Object data[][] = TestUtil.getTestData(sheetName);
			return data;
			}
		
		
	@Test(priority=2, dataProvider="getOpenCartTestData")
		public void EnterData(String fname, String lName,String Email,  String tele, String pw, String cpw){
			Select select = new Select(driver.findElement(By.name("title")));
			select.selectByVisibleText("Register Account");
			
			//dataInsertAndSubmitRegiPage.EnterDataAndSubmit("Tom", "Mazz", "tmazz@gmail.com","123647575", "Test1","Test1");
			
			dataInsertAndSubmitRegiPage.EnterDataAndSubmit(fname, lName, Email,  tele,  pw,  cpw);	
	}
		
	/*@Test
	public void SuccessRegiPagemsgTest(){
		String sm2 = regiSuccessPage.verifySuccesspagemsg2();
		Assert.assertEquals(sm2, "Congratulations! Your new account has been successfully created!");
	}*/
	
	/*@Test
	public void SuccessRegiPagemsgTest(){
		String sm2 = regiSuccessPage.verifySuccesspagemsg2();
		Assert.assertEquals(sm2, "Congratulations! Your new account has been successfully created!");
	}*/
	
	@AfterMethod
	
		public void tearDown(){
			driver.quit();
		}
	

}
