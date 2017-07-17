package test_autoblox;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.apache.commons.logging.Log;

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




public class Cardocs_7_point_chrome extends keywords 
{
	  
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(Cardocs_7_point_chrome.class);
	  
	  

	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		  /*System.setProperty("webdriver.chrome.driver", "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();*/
		   
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

	  } 

	  @Test

	  public void login_test_suit() throws Exception {
		  
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
		  
		  System.out.println(loginid);
		 
		  Thread.sleep(10000);
		  
		  openURL("https://acceptatie.autoblox.eu/CarDocs.aspx");
		  String link = currentURL();
	      System.out.println("Open Link -> " + link);
	      Thread.sleep(10000);
		  
	     dropdownByValue("id","ctl00_cphContent_ddIsClosedSale","0");
		  System.out.println("select Admin");
		  Thread.sleep(10000);
	           
		  dropdownByValue("id","ctl00_cphContent_ddStatus","");
		  System.out.println("select status value");
		  Thread.sleep(10000);
		  
		  dropdownByValue("id","ctl00_cphContent_ddIsSold","1");
		  System.out.println("select content value");
		  Thread.sleep(10000);
		  
		  
	 
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(15L, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
		  WebElement icon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@id,'imgHdrSaleDate')]")));

		  icon.click();
		  System.out.println("image click is working");
		  Thread.sleep(10000);*/
		  clickElement("linkText", "Verkoop"); 
		  System.out.println("sort date");
		  Thread.sleep(10000);
		  /*clickElement("xpath", "//a[contains(@id,'lnkHdrSaleDate')]"); 
		  System.out.println("sort date");
		  Thread.sleep(10000);*/
		  
				 		
 
		  int count = 1;

	      while( count < 2) 
	      {
	    	   	  								  
	    
			  
	    	  for(int x =3; x< 33 ;x++)
	    	  {
				   
				         //System.out.print("Enter the loop \n" );
				         System.out.println("X--> "+x);
				         String dateid= getText ("xpath",".//*[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[11]");
						 String licence= getText ("xpath",".//*[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[12]");
						  System.out.println(dateid + " , "+ licence +" , "+ "Done");
						  Thread.sleep(10000);
							  if(!dateid.contains("2017") )
							   {
								  String S1= "ctl00_cphContent_gvList_ct";
								  int S2= 100 + x ;								 
								  String S3= "_imDocsO";
								  String S=String.format(S1+S2+S3);
								 // System.out.println(S);
								  
								  
								  WebElement img1 = driver.findElement(By.xpath(".//*[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[3]"));
								  
								//  System.out.println(img1);
								
								 
									String inner_HTML = driver.findElement(By.xpath("//table[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[3]")).getAttribute("innerHTML");
									//System.out.println( );
									 
									boolean present;
												
										    
													if( inner_HTML.contains("DocsO.OK.gif"))
													 {
														present = false;
														System.out.println(S+" " + "Test Green"+" " + x);
													
													 }
													else{
														 present = true;
														 
														  System.out.println(S+" " + "Test RED"+" " + x);
															 
														  img1.click();
														  Thread.sleep(4000);
														 // clickElement("id", "ucCarPaperConfirm_btnOK");
														  System.out.println("popup open"); 
										
														 driver.switchTo().frame("ctl00_cphContent_mpCarPaperConfirm_mp_Frame");
														  System.out.println("move to alert");	
														  Thread.sleep(5000);
													      clickElement("id", "ucCarPaperConfirm_btnOK");
													      System.out.println("click on ok");	
													      Thread.sleep(4000);
													      driver.switchTo().defaultContent();
														 
														}
								  
													
								}
							  else 				 
								{
								  System.out.println("its green");
											 
									
								 }
 
	    	  		}count++;
	      
		
	  	    	  clickElement("xpath", ".//*[@id='ctl00_cphContent_gvList_ctl01_gvPager_lnkNext']");
	  			  System.out.println("click on NEXT Second");
	  			  Thread.sleep(10000);
					    	  
	    	  
	      	}
			     
		  
	  }		  
		  
		
				    
	 
	      //function completed
	      
	
	  @AfterClass
	  public  static void tearDown() throws Exception {
	    
		 Thread.sleep(15000);
		 login.logout();
		 System.out.println("logout successfull");
		 logger.info("logout successfully");
		 Thread.sleep(10000);
		 driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
	
 }


