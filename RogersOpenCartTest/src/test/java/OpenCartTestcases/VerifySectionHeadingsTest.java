package OpenCartTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartPages.PersonalDataSecRegiPage;
import OpenCartPages.SectionHeadingsRegiPage;

public class VerifySectionHeadingsTest extends TestBase{
	

	 SectionHeadingsRegiPage sectionHeadingsRegiPage;
	 PersonalDataSecRegiPage personalDataSecRegiPage;
	 
	public VerifySectionHeadingsTest(){
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
	public void RegiPagelabelTest(){
	String Heading = sectionHeadingsRegiPage.verifyRegiPageTitle();
	Assert.assertEquals(Heading, "Register Account");
	}
	
	@Test
	public void RegiPagePDHeadingTest(){
		String heading1 = sectionHeadingsRegiPage.verifyRegipageHeading1();
		Assert.assertEquals(heading1, "Your Personal Details");
	}
	
	@Test
	public void RegiPagePWHeadingTest(){
		String heading2 = sectionHeadingsRegiPage.verifyRegipageHeading2();
		Assert.assertEquals(heading2,"Your Password");
	}
	
	@Test
	public void RegiPageNLHeadingTest(){
		String heading3 = sectionHeadingsRegiPage.verifyRegipageHeading3();
		Assert.assertEquals(heading3, "Newsletter");
		//Assert.assert
	}
	
	
}
