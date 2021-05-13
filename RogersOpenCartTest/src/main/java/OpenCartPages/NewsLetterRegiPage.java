package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OpenCartBase.TestBase;

public class NewsLetterRegiPage extends TestBase{
	
	
	//Page Factory or Object Repository(OR) for Newsletter section:
	
			@FindBy(xpath="//label[contains(text(),'Subscribe')]")
			WebElement subscribe;
			
			//Radio Buttons
			@FindBy(xpath="//div[@class='col-sm-10']/label[1]")
			WebElement subscribeYes;
			
			@FindBy(xpath="//div[@class='col-sm-10']/label[2]")
			WebElement subscribeNo;
			
		
			
			//Initializing the Page Objects:
			public NewsLetterRegiPage(){
				PageFactory.initElements(driver, this);
				}
			 
			//verify Radio Yes and No subscribe buttons
			
			public boolean verifyYessubscribeBtnenabled(){
				 boolean YesEnabled = subscribeYes.isEnabled();			
				 return YesEnabled;
				}
			public boolean verifyYessubscribeBtnenabledDisplay(){
			boolean YesDisply = subscribeYes.isDisplayed();
			return YesDisply;
				}
			
			public boolean verifyNosubscribeBtnenabled(){
				 boolean NoEnabled = subscribeNo.isEnabled();			
				 return NoEnabled;
				}
			public boolean verifyNosubscribeBtnenabledDisplay(){
			boolean NoDisply = subscribeNo.isDisplayed();
			return NoDisply;
			}
			
			
			
		
}
