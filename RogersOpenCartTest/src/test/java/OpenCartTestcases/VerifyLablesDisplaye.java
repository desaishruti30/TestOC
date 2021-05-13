package OpenCartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartPages.NewsLetterRegiPage;
import OpenCartPages.PasswordSecRegiPage;
import OpenCartPages.PersonalDataSecRegiPage;
import OpenCartPages.SectionHeadingsRegiPage;

public class VerifyLablesDisplaye extends TestBase {
	
	SectionHeadingsRegiPage sectionHeadingsRegiPage;
	PersonalDataSecRegiPage personalDataSecRegiPage;
	PasswordSecRegiPage passwordSecRegiPage;
	NewsLetterRegiPage newsletterRegiPage;
	public VerifyLablesDisplaye(){
		super();
	}
	
	@BeforeMethod //initialization 
	
	public void initialization() throws InterruptedException{
		initialize();
		sectionHeadingsRegiPage = new SectionHeadingsRegiPage();
		personalDataSecRegiPage = new PersonalDataSecRegiPage();
		passwordSecRegiPage = new PasswordSecRegiPage();
		newsletterRegiPage = new NewsLetterRegiPage();
			
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
	//Personal Data Section Lable Verification
	@Test
	public void FirstnamelabelTest(){
		Assert.assertTrue(personalDataSecRegiPage.verifyfirstnameLabeldisplay(), "First Name label is Not Visible");
		Assert.assertTrue(personalDataSecRegiPage.verifyfirstnameLabelenabled(), "First Name label is Disabled");
		System.out.println("First Name lable is displayed");
		
	}
	
	@Test
	public void LastnameLableTest(){
		Assert.assertTrue(personalDataSecRegiPage.verifylastnameLabeldisplay(), "Last Name label is Not Visible");
		Assert.assertTrue(personalDataSecRegiPage.verifylastnameLabelenabled(), "Last Name label is is Disabled");
		}
	
	@Test
	public void EmailLableTest(){
		Assert.assertTrue(personalDataSecRegiPage.verifyemailLabeldisplay(), "E-Mail label is Not Visible");
		Assert.assertTrue(personalDataSecRegiPage.verifyemailLabelenabled(), "E-Mail label is Disabled");
		}
	
	@Test
	public void TelephoneLableTest(){
		Assert.assertTrue(personalDataSecRegiPage.verifytelepnoneLabeldisplay(), "Telephone label is Not Visible");
		Assert.assertTrue(personalDataSecRegiPage.verifytelepnoneLabelenabled(), "Telephone label is Disabled");
		}
	
	@Test
	public void PasswordLableTest(){
		Assert.assertTrue(passwordSecRegiPage.verifypasswordLabdisplayed(), "Password label is Not Visible");
		Assert.assertTrue(passwordSecRegiPage.verifypasswordLabelenabled(), "Password label is Disabled");
		}
	
	@Test
	public void ConfirmPWLableTest(){
		Assert.assertTrue(passwordSecRegiPage.verifyConfirmPWLabeldisplayed(), "Password label is Not Visible");
		Assert.assertTrue(passwordSecRegiPage.verifyConfirmPWLabelenabled(), "Password label is Disabled");
		}
			
}
