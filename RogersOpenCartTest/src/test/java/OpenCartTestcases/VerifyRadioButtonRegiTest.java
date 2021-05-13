package OpenCartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartPages.NewsLetterRegiPage;
import OpenCartPages.PersonalDataSecRegiPage;
import OpenCartPages.SectionHeadingsRegiPage;

public class VerifyRadioButtonRegiTest extends TestBase {
	
	SectionHeadingsRegiPage sectionHeadingsRegiPage;
	PersonalDataSecRegiPage personalDataSecRegiPage;
	NewsLetterRegiPage newsLetterRegiPage;
	 
	public VerifyRadioButtonRegiTest(){
		super();
	}
	
@BeforeMethod //initialization 
	
	public void initialization() throws InterruptedException{
		initialize();
		sectionHeadingsRegiPage = new SectionHeadingsRegiPage();
		personalDataSecRegiPage = new PersonalDataSecRegiPage();
		newsLetterRegiPage = new NewsLetterRegiPage();
	}
	
	@AfterMethod
	
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	 
		public void verifyRadioButtons(){
			Assert.assertTrue(newsLetterRegiPage.verifyYessubscribeBtnenabledDisplay(), "Yes subscibe label is not Visible");
			Assert.assertTrue(newsLetterRegiPage.verifyYessubscribeBtnenabled(), "Yes subscibe label is Disabled");
			Assert.assertTrue(newsLetterRegiPage.verifyNosubscribeBtnenabledDisplay(), "No subscibe label is not Visible");
			Assert.assertTrue(newsLetterRegiPage.verifyNosubscribeBtnenabled(), "No subscibe label is Disabled");

}
}
