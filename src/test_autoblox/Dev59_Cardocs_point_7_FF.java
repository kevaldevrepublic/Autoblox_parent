package test_autoblox;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

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




public class Dev59_Cardocs_point_7_FF extends keywords 
{
	  
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(Dev59_Cardocs_point_7_FF.class);
	  
	  

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
	   // FileAppender appender = new FileAppender();
	 // configure the appender here, with file location, etc
	   // appender.activateOptions();

	    //Logger logger = getRootLogger();
	   // logger.addAppender(appender);
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
		  
		  System.out.println(loginid);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  //Thread.sleep(10000);
		  
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
		  Thread.sleep(20000);
		  
		  
	 
		/*Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(15L, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);
		  WebElement icon = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[contains(@id,'imgHdrSaleDate')]")));

		  icon.click();
		  System.out.println("sort date");
		  Thread.sleep(20000);*/
		 /* clickElement("id", "ctl00_cphContent_gvList_ctl02_lnkHdrSaleDate");   
		  System.out.println("sort date");
		  Thread.sleep(20000);/*
		  /*clickElement("linkText", "Verkoop"); 
		  System.out.println("sort date");
		  Thread.sleep(20000);*/
		 clickElement("xpath", "//a[contains(@id,'lnkHdrSaleDate')]"); 
		  System.out.println("sort date");
		  Thread.sleep(20000);
		  /*
		 clickElement("xpath", ".//*[@id='ctl00_cphContent_gvList_ctl01_gvPager_lnkLast']");
		  System.out.println("click on last page 552");
		  Thread.sleep(20000);	  
		
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 550" );
		  Thread.sleep(20000);
		  
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 545" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 541" );
		  Thread.sleep(20000);

		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 535" );
		  Thread.sleep(20000);
		  
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 531" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 525" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 521" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 515" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 511" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 505" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 501" );
		  Thread.sleep(20000);
		 clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 495" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 491" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 485" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 481" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 475" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 471" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 465" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 461" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 455" );
		  Thread.sleep(20000);
		 clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 451" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 445" );
		  Thread.sleep(20000);
		  clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_lnkSetP");
		  System.out.println("click on previoues page dots move on 441" );
		  Thread.sleep(20000);*/
		 /* clickElement("id", "ctl00_cphContent_gvList_ctl01_gvPager_btnPage495");
		  System.out.println("click on previoues page 496" );
		  Thread.sleep(20000);
		  */
		  int count = 365;
		  insertElement("id","ctl00_cphContent_txtPageNumber","365");
		  System.out.println("number inputed " + count);	
		  Thread.sleep(10000); 			  
		  clickElement("id", "ctl00_cphContent_btnGoToPageNumber");
		  System.out.println("click on Go to page number "+ count);	
		  Thread.sleep(20000);  
	 
		

	      while( count > 1) 
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
								 /* String S1= "ctl00_cphContent_gvList_ct";
								  int S2= 100 + x ;								 
								  String S3= "_imDocsO";
								  String S=String.format(S1+S2+S3);*/
								 // System.out.println(S);
								  
								  
								  WebElement img1 = driver.findElement(By.xpath(".//*[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[3]"));
								  
								//  System.out.println(img1);
								
								 
									String inner_HTML = driver.findElement(By.xpath("//table[@id='ctl00_cphContent_gvList']/tbody/tr["+x+"]/td[3]")).getAttribute("innerHTML");
									//System.out.println( );
									 
									boolean present;
												
										    
													if( inner_HTML.contains("DocsO.OK.gif") || inner_HTML.contains("DocsO.NOK.gif"))
													 {
														present = false;
														//System.out.println(S+" " + "Test Green"+" " + x);
													
													 }
													else{
														 present = true;
														 Thread.sleep(4000);
														  //System.out.println(S+" " + "Test RED"+" " + x);
															 
														  img1.click();
														  Thread.sleep(8000);
														 // clickElement("id", "ucCarPaperConfirm_btnOK");
														  System.out.println("popup open"); 
														  Thread.sleep(8000);
														 driver.switchTo().frame("ctl00_cphContent_mpCarPaperConfirm_mp_Frame");
														  System.out.println("move to alert");	
														  Thread.sleep(10000);
													      clickElement("id", "ucCarPaperConfirm_btnOK");
													      System.out.println("click on ok");	
													      Thread.sleep(8000);
													      driver.switchTo().defaultContent();
													      Thread.sleep(8000);
													      
														}
								  
													
								}
							  else 				 
								{
								  System.out.println("its 2017 record");
											 
									
								 }
 
	    	  		}count --;
	    	  		Thread.sleep(4000);
		
	    	  	  clickElement("xpath", ".//*[@id='ctl00_cphContent_gvList_ctl01_gvPager_lnkPrev']");
	   			  System.out.println("click on previoues page "+ count );
	   			  Thread.sleep(4000);		
					    	  
	    	  
	      	}
			     
		  
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


