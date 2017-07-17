package test_autoblox;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.logging.Log;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import com.gargoylesoftware.htmlunit.Version;




public class test extends keywords 
{
	  
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(test.class);
	  
	  

	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		
		   
		   driver = new FirefoxDriver();   
		driver.manage().deleteAllCookies();  
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
	   driver.manage().deleteAllCookies();  

	  } 

	
	

	@Test

	  public void login_test_suit() throws Exception 
	{
		  
		  login.navigateLoginacceptance();
		  logger.info("Enter in website");
		  String loginurl = driver.getCurrentUrl();
		  System.out.println(loginurl + "open website");
		  
		  login.correctLoginacceptance();
		  logger.info("login sucessfull");
		  System.out.println("login sucessfull");
		  
		  String homeurl = driver.getCurrentUrl();
		  System.out.println(homeurl);
		  
		  String loginid= getText ("id","ctl00_lblUserName");
		  
		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //Thread.sleep(10000);

		  System.out.println(loginid);
		  
		  openURL("https://acceptatie.autoblox.eu/CarDocs.aspx");
		  String link = currentURL();
	     
	      driver.wait();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      System.out.println("Open Link -> " + link);
	      
	      WebDriverWait wait = new WebDriverWait(driver, 10);
	      
	      
	     dropdownByValue("id","ctl00_cphContent_ddIsClosedSale","0");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println("select Admin");
	}
		
				    
	 
	      //function completed
	      
	
	  @AfterClass
	  public  static void tearDown() throws Exception {
	    
		 Thread.sleep(15000);
		 //login.logout();
		 //System.out.println("logout successfull");
		 //logger.info("logout successfully");
		// Thread.sleep(10000);
		 //driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	  

}


