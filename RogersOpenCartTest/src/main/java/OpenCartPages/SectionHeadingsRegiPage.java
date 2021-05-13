package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OpenCartBase.TestBase;

public class SectionHeadingsRegiPage extends TestBase{
	
	
	//Page Factory or Object Repository(OR) for all section headings
		
		@FindBy(xpath="//div[@id='content']/h1")
		WebElement pageheading;
		
		@FindBy(xpath="//legend[contains(text(),'Your Personal Details')]")
		WebElement pdheading;
		
		@FindBy(xpath="//legend[contains(text(),'Your Password')]")
		WebElement pwheading;
		
		@FindBy(xpath="//legend[contains(text(),'Newsletter')]")
		WebElement nlheading;
	
		
		
	
	//Page Factory or Object Repository(OR) for error msg when all Required field are blanks
		
		@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
		WebElement fnErr;
		
		@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
		WebElement lnErr;
		
		@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
		WebElement emailErr;
		
		@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
		WebElement teleErr;
		
		@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]")
		WebElement pwErr;
		
	//Page Factory or Object Repository(OR) for error msg for password confirmation field
		@FindBy(xpath="//div[contains(text(),'Password confirmation does not match password!')]")
		WebElement pwcErr;
		
	//Initializing the Page Objects:
				public SectionHeadingsRegiPage(){
					PageFactory.initElements(driver, this);
				}
		
	//Actions to be perform on Regi page:
				public String verifyRegiPageTitle(){
					return driver.getTitle();
				}
				
							
				public  String verifyRegipageHeading1() {
					String  heading1 = pdheading.getText();
					System.out.println(heading1);
					return heading1;
					}
				
				public  String verifyRegipageHeading2() {
					String  heading2 = pwheading.getText();
					System.out.println(heading2);
					return heading2;
					}
				
				public  String verifyRegipageHeading3() {
					String  heading3 = nlheading.getText();
					System.out.println(heading3);
					return heading3;
					}
					
	
}
