package test_autoblox.MB_issues;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.thoughtworks.selenium.webdriven.commands.IsAlertPresent;

import test_autoblox.excel_datadriven;
import test_autoblox.keywords;
import test_autoblox.login;

public class collect_cardata extends keywords {
	
	private static String baseUrl;
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	final static Logger logger = Logger.getLogger(collect_cardata.class);
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe");
//		 WebDriver driver=new ChromeDriver();
		driver = new FirefoxDriver();
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

	public void collect_cardata1() throws Exception 
	{
		//try
		//{
		
			login.regression_acceptancelive();
			logger.info("Enter in website");
			String loginurl = driver.getCurrentUrl();
			System.out.println(loginurl + " <-:open website");

			login.acceptlive_correctLogin();
			logger.info("login sucessfull");
			System.out.println("login sucessfull");

			String homeurl = driver.getCurrentUrl();
			System.out.println(homeurl);

			String loginid= getText ("id","ctl00_lblUserName");

			System.out.println(loginid);

			Thread.sleep(5000);
			
			clickElement("id","ctl00_mmNewCar_lnk");
			Thread.sleep(5000);
			
			excelgetcardata();
		   	String a=excel_datadriven.getCellData(0, 0);
		   			
			insertElement("id", "ctl00_cphContent_tbKenteken", a);
			clickElement("id", "ctl00_cphContent_bNext");
			Thread.sleep(5000);
			System.out.println("click on next");
			Thread.sleep(5000);
			
			java.lang.String checked = driver.findElement(By.xpath("//input[@id='ctl00_cphContent_rbYellowLicenseYes']")).getAttribute("checked");
		
			System.out.println("checked value:- " + checked);
			
			/*if( checked.contains("checked"))
			{
				
				System.out.println("Its Yellow");

			}
			else{
			
				
				System.out.println("Its Grey");
			
			}*/
			
			
			
			
			/*
			String date= getText("id", "ctl00_cphContent_dsDateKenteken_tbDate");
			System.out.println(date);
			Thread.sleep(2000);
			String BPM= getText("id", "ctl00_cphContent_tbBPM");
			System.out.println(BPM);
			Thread.sleep(2000);
			*/
			
			 login.logout();
 			Thread.sleep(3000);
			
 			driver.quit();
			
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

