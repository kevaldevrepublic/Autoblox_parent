package test_autoblox;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.log4j.Logger;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;




public class Dev_20 extends keywords {
	  public static WebDriver driver;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(Dev_20.class);
	  
	  

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

	  public void login_test_suit() throws Exception {
		  
		  login.navigateLogin();
		  logger.info("Enter in website");
		  System.out.println("open website");
		  
		  login.correctLogin();
		  logger.info("login sucessfull");
		  System.out.println("login sucessfull");
		  
		 		  
		 
		//  test_autoblox.Beheer.Bedrijfs_beheer.clickon_Bedrijfs_beheer();
	//	  logger.info("Click on Beheer>>Bedrijfs_beheer from menubar");
		//  System.out.println("Display all data of Bedrijfs_beheer");
		  
		 
		//  test_autoblox.Beheer.createnew.filter.filter_click ();
		//  logger.info("filter data and diaply all data");
		//  System.out.println("filter data and diaply all data");
		  
	//	  test_autoblox.test2.readExcel(null);
		//  logger.info("open excel and all data display");
		//  System.out.println("open excel and all data display");
		  
		  
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
	
 }


