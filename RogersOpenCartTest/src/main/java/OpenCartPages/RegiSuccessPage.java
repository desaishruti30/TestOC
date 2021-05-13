package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;

import OpenCartBase.TestBase;

public class RegiSuccessPage extends TestBase{
	//Page Factory or Object Repository(OR) for success page validation 
	
			@FindBy(xpath="//h1[contains(text(),'Your Account Has Been Created!')]")
			WebElement regisuccess;
								
			@FindBy(xpath="//div[@id='content']/p[1]")
			WebElement ssml1; //ssml1= success message Line 1
			
			@FindBy(xpath="//div[@id='content']/p[2]")
			WebElement ssml2;
					
			@FindBy(xpath="//div[@id='content']/p[3]")
			WebElement ssml3;
						
			@FindBy(xpath="//div[@id='content']/p[4]")
			WebElement ssml4;
			
			@FindBy(xpath="//a[@class='btn btn-primary']")
			WebElement continuebtn;
			
			public RegiSuccessPage(){
				PageFactory.initElements(driver, this);
				}

			public boolean VerifySuccesspageTitle(){
				return regisuccess.isDisplayed();
				}
			
					
			public String verifySuccessRegiPageTitle(){
				return driver.getTitle();
				}
			
					
			
			public  String verifySuccesspagemsg1() {
				String  msg1 = ssml1.getText();
				System.out.println(msg1);
				return msg1;
				}
			
			public  String verifySuccesspagemsg2() {
				String  msg2 = ssml2.getText();
				System.out.println(msg2);
				return msg2;
				}
			public  String verifySuccesspagemsg3() {
				String  msg3 = ssml3.getText();
				System.out.println(msg3);
				return msg3;
				}
			public  String verifySuccesspagemsg4() {
				String  msg4 = ssml4.getText();
				System.out.println(msg4);
				return msg4;
				}
			
			public boolean verifyContinueBtnenabledDisplay(){
				boolean Continue = continuebtn.isDisplayed();
				return Continue;
				}
			
			/*String requiredErrorMessage = "Please correct the marked field(s) below.";
			Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);
			String actualErrorDisplayed = driver.findElement(byError).getText();*/
}

