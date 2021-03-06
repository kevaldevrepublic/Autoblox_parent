package test_autoblox;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//import org.testng.annotations.*;
import com.gargoylesoftware.htmlunit.Version;




public class loginsuit extends keywords {
	  public static WebDriver driver;
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(loginsuit.class);
	  
	  

	  @BeforeClass
	  public static void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
	    
	    String os = cap.getPlatform().toString();
	    System.out.println(os);
	   	   
	    String browserName = cap.getBrowserName().toLowerCase();
	    System.out.println(browserName);
	    
	    String version = cap.getVersion().toString();
	    System.out.println(version);
	    keywords.setFirefoxDriver(driver);

	  } 

	  @Test

	  public void login_test_suit() throws Throwable {
		  
		  login.navigateLogin();
		  logger.info("Enter in website");
		  System.out.println("open website");
		  
		  login.correctLogin();
		  logger.info("login sucessfull");
		  System.out.println("login sucessfull");
		  
		  test_autoblox.home.Home.clickhome();
		  logger.info("Click on home button from menubar");
		  System.out.println("Click on home button from menubar");
		
		  
		  //**check current user rights & change current user password**
		  test_autoblox.Mijn_gegevens.Gebruikergegevens.clickon_Gebruikergegevens();
		  logger.info("open & check admin details");
		  System.out.println("open & check admin details");
		  
		  refresh();
		  //**open all company page**
		 test_autoblox.Beheer.Bedrijfs_beheer.clickon_Bedrijfs_beheer();
		 logger.info("Click on Beheer>>Bedrijfs_beheer from menubar");
		 System.out.println("Display all data of Bedrijfs_beheer");
		 
		  //*create company*
		   test_autoblox.Beheer.createnew.Nieuw_bedrijf.required_fields ();
		 logger.info("Click on Beheer>>Bedrijfs_beheer from menubar and create new company");

		  test_autoblox.Beheer.createnew.filter.filter_click ();
		  logger.info("filter data and diaply all data");
		  System.out.println("filter data and diaply all data");
		
		  //*create new user*
		 
		  test_autoblox.Beheer.createnew.user_create.new_user_admin();
		  System.out.println("for create new user");
		  test_autoblox.Beheer.createnew.user_create.edit_user();
		  System.out.println("edit user");
		  driver.switchTo().frame("ctl00_cphContent_ucUsers_ucUserFrame_mfFrame");
		  test_autoblox.Beheer.createnew.user_create.required_fields();
		  test_autoblox.Beheer.createnew.user_create.Allfields ();
		  driver.switchTo().alert().accept();
	      Thread.sleep(5000);
		  clickElement("xpath" ,"//*[contains(@UID,'0e210d82-48b5-4436-af2a-ee5171bac9f5')]");
		  clickElement("xpath" ,"//a[@id='ctl00_cphContent_ucUsers_gvList_ctl06_lbUserNameLink']");
		  driver.switchTo().frame("ctl00_cphContent_ucUsers_ucUserFrame_mfFrame");		  
		  System.out.println("click user id which you want to given admin rights");	 
		  test_autoblox.Beheer.createnew.user_create.admin_assign();
		  System.out.println("assign to admin rights");	
		  Thread.sleep(5000);
		  
		  //*Create Car waiting...
		  
		  
		  
		  System.out.println("all done");	  
		  
		  login.logout();
		  logger.info("logout successfully");
		   
	  }


	  @AfterClass
	  public  static void tearDown() throws Exception {
	    
		 Thread.sleep(15000);
		
		driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }	
	
 }


