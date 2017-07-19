package test_autoblox;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import test_autoblox.keywords;

public class Dev89_Bedrijfsgegevens extends keywords {

	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	final static Logger logger = Logger.getLogger(Dev89_Bedrijfsgegevens.class);



	@BeforeClass
	public static void setUp() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		//driver = new FirefoxDriver();  
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
		try{  

			login.navigateLogin();
			logger.info("Enter in website");
			String loginurl = driver.getCurrentUrl();
			System.out.println(loginurl + "\n open website");

			login.correctLogin();
			logger.info("login sucessfull");
			System.out.println("login sucessfull");

			String homeurl = driver.getCurrentUrl();
			System.out.println(homeurl);

			String loginid= getText ("id","ctl00_lblUserName");

			System.out.println(loginid);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			clickElement("id","ctl00_mmMyData_lnk");
			System.out.println("clicked in menu");
			Thread.sleep(10000);
			
			clickElement("linkText","Bedrijfsgegevens");
			//clickElement("xpath","//a[contains(.,'Bedrijfsgegevens')]");
			System.out.println("clicked in company");
			Thread.sleep(10000);
			
			clickElement("id","ctl00_cphContent_tbsCompany_tbbProtocols_bTab");
			System.out.println("clicked in workflow");
			Thread.sleep(10000);
			
			clickElement("id","ctl00_cphContent_ucProtocols_gvList_ctl03_btnProtocolName");
			System.out.println("clicked in second element");
			Thread.sleep(10000);
			
			driver.switchTo().frame("ctl00_cphContent_ucProtocols_mfProtocolEdit_mfFrame");
			System.out.println("move to alert");	
			Thread.sleep(8000);
			
			String a = getText("xpath",".//*[@id='mp_divPage']/table/tbody/tr/td[2]/table/tbody/tr/td[1]");
			System.out.println(a);
			Thread.sleep(8000);
			clickElement("id","lnkModalCancel");
			
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			
			String b = getText("id","ctl00_cphContent_ucProtocols_dvProtocolHeader");
			System.out.println(b);
		}

		catch(Exception e){

			//Thread.sleep(15000);
			System.out.println("Unexpected Error");
			logger.info("Unexpected Error");
			//driver.quit();
			//System.out.println("quit done");

		}



	}		  





	//function completed


	@AfterClass
	public  static void tearDown() throws Exception {

		Thread.sleep(15000);
		login.logout();
		System.out.println("logout successfull");
		logger.info("logout successfully");
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(5000);
		System.out.println("quit done");


		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}


