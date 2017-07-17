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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.gargoylesoftware.htmlunit.Version;



public class Dev59_Cardocs_point_6_FF extends keywords 
{
	  
	  private static String baseUrl;
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  final static Logger logger = Logger.getLogger(Dev59_Cardocs_point_6_FF.class);
	  
	  

	  @BeforeClass
	  public static void setUp() throws Exception 
	  {
		 // System.setProperty("webdriver.chrome.driver", "D:\\Devrepublic\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
		  // WebDriver driver=new ChromeDriver();
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
	           
	      dropdownByValue("id","ctl00_cphContent_ddStatus","11");
		  System.out.println("select status value");
		  Thread.sleep(10000);
		  
		  dropdownByValue("id","ctl00_cphContent_ddIsSold","1");
		  System.out.println("select content value");
		  Thread.sleep(10000);
		  
		  clickElement("xpath", ".//*[@id='ctl00_cphContent_gvList_ctl02_lnkHdrSaleDate']"); 
		  System.out.println("sort date");
		  String dateid1= getText ("xpath",".//*[@id='ctl00_cphContent_gvList']/tbody/tr[3]/td[11]");
		  System.out.println(dateid1);
		  
		 		  

		  int x = 3;

	      while( x > 0 ) 
				      {
				         System.out.print("Enter the loop \n" );
				         
				         String dateid= getText ("xpath",".//*[@id='ctl00_cphContent_gvList']/tbody/tr[3]/td[11]");
						  System.out.println(dateid);
						  Thread.sleep(10000);
			  
							  if(!dateid.contains("2017") )
							  {
							  //start function process
								  System.out.println("click on icon before");
								  //clickElement("xpath","//img[contains(@src,'images/icon.CarDocs.CodeO.gif')]");  
								  
								  clickElement("id", "ctl00_cphContent_gvList_ctl03_imCodeO"); 
								  System.out.println("click on icon");
								  Thread.sleep(4000);
								 
								  driver.switchTo().frame("ctl00_cphContent_mpCarDocs_mp_Frame");
								  System.out.println("move to alert");	
							      insertElement("id","ucCarDocs_tbDocNo","0000000000");
							      System.out.println("first field inserted");	
							      Thread.sleep(4000);
							      
							      insertElement("id","ucCarDocs_tbDocCode","000000000");
							      System.out.println("second field inserted");	
							      Thread.sleep(4000);
							      
							      clickElement("id", "ucCarDocs_btnOK");
							      System.out.println("close alert");	
							      Thread.sleep(4000);
							      driver.switchTo().defaultContent();
							      //refresh();
							      Thread.sleep(4000);
							      x--;
							      System.out.println(x);	
							      
							  }
							  else 
							  {
								  System.out.println("its break");
								  break;
						    	 
								 
							  }
	 
				      }
		  
	      if(x==0)
	      {
	    	  System.out.println("function successfully completed ");
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



