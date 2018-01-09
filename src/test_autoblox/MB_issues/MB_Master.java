package test_autoblox.MB_issues;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

import test_autoblox.keywords;
import test_autoblox.login;

public class MB_Master extends keywords {
	
	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	final static Logger logger = Logger.getLogger(MB_Master.class);
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();  
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
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

	public void MBissues() throws Exception 
	{
		//try
		//{
		
			login.navigateMBLink();
			logger.info("Enter in website");
			String loginurl = driver.getCurrentUrl();
			System.out.println(loginurl + " <-:open website");

			login.correctLogin();
			logger.info("login sucessfull");
			System.out.println("login sucessfull");

			String homeurl = driver.getCurrentUrl();
			System.out.println(homeurl);

			String loginid= getText ("id","ctl00_lblUserName");

			System.out.println(loginid);

			Thread.sleep(10000);
			
			for (int i = 0; i < 2; i++) 
				
				
	        {
	           /* for (int y = 0; y < 10; y++) 
	            {
	            	
	            	for (int z = 0; z < 10; z++) 
	            	{*/
	            		
	            		String search_insert = /*"ASD005";*/"ASDgm"+i/* + y + z*/;
	            		clearElement("id", "ctl00_tbGlobalSearch");
	            		insertElement("id", "ctl00_tbGlobalSearch", search_insert);
	            		Thread.sleep(5000);
	            		System.out.println("inserted values in search");
	            		clickElement("id","ctl00_ibGlobalSearch");
	            		System.out.println("click search:->  " + search_insert );
	            		Thread.sleep(5000);
	            		//boolean IsAlertPresent;
	            		{ 
	            		    try 
	            		    { 
	            		    	Alert confirmationAlert = driver.switchTo().alert();
	    	            		String alertText = confirmationAlert.getText();
	    	            		System.out.println("Alert text is " + alertText);
	    	            		confirmationAlert.accept();
	    	            		Thread.sleep(5000);
	    	            		System.out.println("New create car with this vsb:->  " + search_insert );
	    	            		MB_issues.navigate_newcar();
		            			MB_issues.createcar(search_insert);
		            			System.out.println("move to mb master");
		            			System.out.println("\n\n\n**************************************\n\n\n");
		            			
		            			Thread.sleep(5000);
		            			
	            		         
	            		    }  
	            		    catch (NoAlertPresentException Ex) 
	            		    { 
	            		    	System.out.println("vsb is already there");
		            			multiplewindow2();
		            			System.out.println("\n\n\n**************************************\n\n\n");
		            			Thread.sleep(5000);
		            			
	            		    }   
	            		    
	            		   
	            		//} 
						
	              //	}
	            	
	            } 
		
	        }
			
			
			
			 login.logout();
 			Thread.sleep(3000);
			
			
			
		//}
		
		/*catch(Exception e)
			{

			System.out.println("mb issues in catch");
			System.out.println("quit browser");
			//driver.quit();
			
			}*/
		

	

	}
	
	
	
	@AfterClass
	
	
	public  static void tearDown() throws Exception {

		Thread.sleep(15000);
		//login.logout();
		//System.out.println("logout successfull");
		//logger.info("logout successfully");
		//Thread.sleep(10000);

		driver.quit();
		Thread.sleep(1000);
		System.out.println("quit done");
		

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}

