package OpenCartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import OpenCartBase.TestBase;
import OpenCartUtil.TestUtil;



public class DataInsertAndSubmitRegiPage extends TestBase{
	//Page Factory or Object Repository(OR) 
	@FindBy(xpath="//div[@id='content']/h1")
	WebElement pageheading;
	
	@FindBy(name="firstname")
	WebElement firstname;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="telephone")
	WebElement telephone;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="password Confirm")
	WebElement confirm;
	
	//Radio Buttons
	@FindBy(xpath="//div[@class='col-sm-10']/label[1]")
	WebElement subscribeYes;
	
	@FindBy(xpath="//div[@class='col-sm-10']/label[2]")
	WebElement subscribeNo;
	
	@FindBy(xpath="//b[contains(text(),'Privacy Policy')]")
	WebElement pplabel;
			
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement ppchbox;
	
//Page Factory or Object Repository(OR) for continue button
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebtn;
	
	
	public DataInsertAndSubmitRegiPage(){
		PageFactory.initElements(driver, this);
		}
	
	public boolean verifypageLabel(){
		return pageheading.isEnabled();
	}
	
		public  void EnterDataAndSubmit(String fname, String lName,String Email,  String tele, String pw, String cpw) {
		
		firstname.sendKeys(fname);
		lastname.sendKeys(lName);
		email.sendKeys(Email);
		telephone.sendKeys(tele);
		password.sendKeys(pw);
		confirm.sendKeys(cpw);
		subscribeYes.click();
		//subscribeNo.click();
		ppchbox.click();
		continuebtn.click();
		
		//return new RegiSuccessPage();	
	}


		}
