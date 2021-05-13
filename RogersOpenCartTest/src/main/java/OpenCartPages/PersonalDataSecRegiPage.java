package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import OpenCartBase.TestBase;

public class PersonalDataSecRegiPage extends TestBase{
	
	//Page Factory or Object Repository(OR) for Your personal Data section :
			@FindBy(xpath="//label[contains(text(),'First Name')]")
			WebElement fnlabel;
			
			@FindBy(name="firstname")
			WebElement firstname;
			
			@FindBy(xpath="//label[contains(text(),'Last Name')]")
			WebElement lnlabel;
			
			@FindBy(name="lastname")
			WebElement lastname;
					
			@FindBy(xpath="//label[contains(text(),'E-Mail')]")
			WebElement emaillabel ;
			
			@FindBy(name="email")
			WebElement email;
			
			@FindBy(xpath="//label[contains(text(),'Telephone')]")
			WebElement telelabel;
			
			@FindBy(name="telephone")
			WebElement telephone;
			
			//Page Factory or Object Repository(OR) for all section headings
			
			@FindBy(xpath="//h1[contains(text(),'Register Account')]")
			WebElement pageheading;
			
			
		//Initializing the Page Objects:
			public PersonalDataSecRegiPage(){
				PageFactory.initElements(driver, this);
				}
			
						
			public boolean verifyfirstnameLabelenabled(){
				return firstname.isEnabled();
				}
			public boolean verifylastnameLabelenabled(){
				return lastname.isEnabled();
				}
			public boolean verifyemailLabelenabled(){
				return email.isEnabled();
				}
			public boolean verifytelepnoneLabelenabled(){
				return telephone.isEnabled();
				}
			
			public boolean verifyfirstnameLabeldisplay(){
				return firstname.isDisplayed();
				}
			public boolean verifylastnameLabeldisplay(){
				return lastname.isDisplayed();
				}
			public boolean verifyemailLabeldisplay(){
				return email.isDisplayed();
				}
			public boolean verifytelepnoneLabeldisplay(){
				return telephone.isDisplayed();
				}
			
				
}
