package OpenCartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartPages.PersonalDataSecRegiPage;
import OpenCartPages.SectionHeadingsRegiPage;

public class VeryfiyTexBoxes extends TestBase {

	SectionHeadingsRegiPage sectionHeadingsRegiPage;
	PersonalDataSecRegiPage personalDataSecRegiPage;
	 
	public VeryfiyTexBoxes(){
		super();
	}
	
@BeforeMethod //initialization 
	
	public void initialization() throws InterruptedException{
		initialize();
		sectionHeadingsRegiPage = new SectionHeadingsRegiPage();
		personalDataSecRegiPage = new PersonalDataSecRegiPage();
			
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	 
		public void verifyTextbox(){
			Assert.assertTrue(personalDataSecRegiPage.verifyfirstnameLabeldisplay(), "firstname label is not displayed");
			Assert.assertTrue(personalDataSecRegiPage.verifylastnameLabeldisplay(), "lastname label is not displayed");
			Assert.assertTrue(personalDataSecRegiPage.verifyemailLabeldisplay(), "email label is not displayed");
			Assert.assertTrue(personalDataSecRegiPage.verifytelepnoneLabeldisplay(), "telephpne label is not displayed");
			Assert.assertTrue(personalDataSecRegiPage.verifyemailLabelenabled(), "firstname label is Disabled");
			Assert.assertTrue(personalDataSecRegiPage.verifyemailLabelenabled(), "lastname label is Disabled");
			Assert.assertTrue(personalDataSecRegiPage.verifyemailLabelenabled(), "email label is Disabled");
			Assert.assertTrue(personalDataSecRegiPage.verifyemailLabelenabled(), "telephpne label is Disabled");

			}

}

