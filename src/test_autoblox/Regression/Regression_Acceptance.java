package test_autoblox.Regression;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.RemoteWebDriver;

import test.GetCurrentDateTime;

import org.apache.log4j.Logger;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import test_autoblox.keywords;
import test_autoblox.login;
import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;



public class Regression_Acceptance extends keywords {
	  public static WebDriver driver;
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger log = Logger.getLogger(Regression_Acceptance.class.getName());
	  
	  

	  @BeforeClass
	  public static void setUp() throws Exception {
	    driver = new FirefoxDriver();
		  /*System.setProperty("webdriver.chrome.driver", "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();*/
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

	    GetCurrentDateTime CT=  GetCurrentDateTime.getInstance();
	    System.out.println(CT.getData());
	    
	  } 

	  @Test

	  public void login_test_suit() throws Throwable {
		  
		  login.regression_acceptance();
		  log.info("Enter in website");
		  System.out.println("open website");
		  Thread.sleep(2000);
		  
		  login.correctLogin();
		  log.info("login sucessfull");
		  System.out.println("login sucessfull");
		  Thread.sleep(8000);
		  
		  test_autoblox.home.Home.clickhome();
		  log.info("Click on home button from menubar");
		  System.out.println("Click on home button from menubar");
		  Thread.sleep(2000);
		  //create car
		  
		 Create_Car.searchcar1();
		 Create_Car.searchcar2();
		  
		  /*
		  Regression_basic.open_Companylist();
		  log.info("open:->open_Companylist ");
		  System.out.println("open:->open_Companylist ");
		  Regression_basic.mycar();
		  log.info("open:->mycar");
		  System.out.println("open:->mycar");
		  Regression_basic.Betalingen_payment();
		  log.info("open:->Betalingen_payment");
		  System.out.println("open:->Betalingen_payment");
		  
		  
		  log.info("open:-> Syatemlog");
		  System.out.println("open:-> Systemlog");
		  Regression_basic.systemlog();
		  
		  */
		  System.out.println("all done");	  
		  
		  login.logout();
		  log.info("logout successfully");
		   
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


