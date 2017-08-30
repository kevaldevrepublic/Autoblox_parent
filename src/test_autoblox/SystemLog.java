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




public class SystemLog extends keywords 
{

	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	final static Logger logger = Logger.getLogger(SystemLog.class);



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
		try{    
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
/*<------------------------------------------login Done------------------------------------------------>*/

			
			mouse_move("id","ctl00_mmFS_tab", "linkText","System Log" );
			System.out.println("hover done");
			Thread.sleep(10000);
			
			clickElement("id", "ctl00_cphContent_dvErrorHeader");
			
			
			dropdownByValue("id","ctl00_cphContent_ddLogLevel","9");
			System.out.println("select Admin");
			Thread.sleep(10000);

			clickElement("id", "ctl00_cphContent_ibSearch");
			Thread.sleep(10000);
			
			clickElement("id", "ctl00_cphContent_dvErrorHeader");
			
			
			String Navigate_page_Details = getmessage("xpath", ".//*[@id='ctl00_cphContent_gvList']/tbody/tr[1]/td");
			System.out.println(Navigate_page_Details);

		
			Thread.sleep(20000);
			
			}

			

		catch(Exception e){

			System.out.println("login_test_suit Exception");
			System.out.println("quit browser");
			driver.quit();
			Thread.sleep(5000);
			System.out.println("Exception quit done");
			Thread.sleep(5000);
			System.out.println("Exception open new");
			Thread.sleep(5000);
			
		}



	}		  




	//function completed


	@AfterClass
	public  static void tearDown() throws Exception {

		Thread.sleep(15000);
		//login.logout();
		//System.out.println("logout successfull");
		// logger.info("logout successfully");
		// Thread.sleep(10000);

		driver.quit();
		Thread.sleep(10000);
		System.out.println("quit done");
		setUp();
		SystemLog obj = new SystemLog();
		obj.login_test_suit();

		System.out.println("Strat again");

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}


