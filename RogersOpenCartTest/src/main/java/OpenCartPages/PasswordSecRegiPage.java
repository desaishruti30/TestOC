package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OpenCartBase.TestBase;

public class PasswordSecRegiPage extends TestBase {
	
		//Page Factory or Object Repository(OR) for Your Password section :
	
			@FindBy(xpath="//label[contains(text(),'Password')]")
			WebElement pwlabel;
			
			@FindBy(name="password")
			WebElement password;
			
			@FindBy(xpath="//label[contains(text(),'Password Confirm')]")
			WebElement pwclabel;

			@FindBy(name="password confirm")
			WebElement confirm;
			
			//Initializing the Page Objects:
			public PasswordSecRegiPage(){
				PageFactory.initElements(driver, this);
				}
			
						
			public boolean verifypasswordLabelenabled(){
				return password.isEnabled();
				}
			public boolean verifyConfirmPWLabelenabled(){
				return confirm.isEnabled();
				}
			public boolean verifypasswordLabdisplayed(){
				return password.isDisplayed();
				}
			public boolean verifyConfirmPWLabeldisplayed(){
				return confirm.isDisplayed();
				}
			
			

}
