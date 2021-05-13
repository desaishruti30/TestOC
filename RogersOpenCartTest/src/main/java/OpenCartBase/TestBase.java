package OpenCartBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import OpenCartUtil.TestUtil;

public class TestBase {
//global variables
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		 
		try {
			prop = new Properties();
		//C:\Selenium_Workspace\RogersOpenCartTest\src\main\java\OpenCartConfig\config.properties
			FileInputStream ip = new FileInputStream("C:/Selenium_Workspace/RogersOpenCartTest/src/main/java/OpenCartConfig/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//Browser Initialization  
	public static void initialize() {
		String browser = prop.getProperty("browser");
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
//web page windows operations	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

//getting url from config.proprties file		
		driver.get(prop.getProperty("url"));
	
	}
	
	}



