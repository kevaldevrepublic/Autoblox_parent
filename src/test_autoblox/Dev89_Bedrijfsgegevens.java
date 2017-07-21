package test_autoblox;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		/*try{  */
/* -------------------------------------------VFS check in company name-------------------------------*/
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
			
			mouse_move("id","ctl00_mmMyData_tab", "linkText","Bedrijfsgegevens" );
			System.out.println("hover done");
			Thread.sleep(5000);
			
			/*
			//clickElement("xpath","//a[contains(.,'Mijn gegevens')]");
			clickElement("xpath","//a[contains(@id,'ctl00_mmMyData_lnk')]");
			//clickElement("id","ctl00_mmMyData_lnk");
			//hover("id","ctl00_mmMyData_lnk");
			System.out.println("clicked in menu");
			Thread.sleep(5000);
			
			clickElement("linkText","Bedrijfsgegevens");
			//clickElement("xpath","//a[contains(.,'Bedrijfsgegevens')]");
			System.out.println("clicked in company list");
			Thread.sleep(5000);
			*/
			String company_name = driver.findElement(By.id("ctl00_cphContent_tbName")).getAttribute("value");
			System.out.println(company_name);
			
						
			clickElement("id","ctl00_cphContent_tbsCompany_tbbProtocols_bTab");
			System.out.println("clicked in workflow");
			Thread.sleep(10000);
			
			clickElement("id","ctl00_cphContent_ucProtocols_gvList_ctl03_btnProtocolName");
			System.out.println("clicked in second element");
			Thread.sleep(10000);
			
			driver.switchTo().frame("ctl00_cphContent_ucProtocols_mfProtocolEdit_mfFrame");
			System.out.println("move to alert");	
			Thread.sleep(8000);
			
					
			WebElement checkbox = driver.findElement(By.xpath("//input[contains(@id,'ctl_cbIsVSB')]"));
			
					if(!checkbox.isSelected())
					{
						System.out.println("checkbox is not selected");
						checkbox.click();
						System.out.println("Now checkbox is selected");
					}
					else 
					{
						System.out.println("checkbox is selected");
		
					}
			Thread.sleep(10000);
			
			
			
			System.out.println("move to ok");
			
			
			clickElement("id","ctl_bUpdate");
			Thread.sleep(10000);
			System.out.println("click on ok");
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			/* -------------------------------------------New Car Created with VFS-------------------------------*/		
			clickElement("id","ctl00_mmNewCar_lnk");	
			Thread.sleep(10000);
			System.out.println("Create new car page open");
			
			clickElement("id","ctl00_cphContent_rblHasKenteken_2");
			System.out.println("VSB radio button selected");
			Thread.sleep(5000);
			
			insertElement("id","ctl00_cphContent_tbVSB","1125AB");
			System.out.println("VSB inserted");
			Thread.sleep(5000);
			
			clickElement("id","ctl00_cphContent_bSelectCompany");
			System.out.println("click on search");
			Thread.sleep(10000);
			
			/*driver.switchTo().frame("ctl00_cphContent_mctlCompanySelection_pnlControlLoader");
			System.out.println("move to alert");	
			Thread.sleep(8000);*/
			
			driver.switchTo().alert();
			System.out.println("move to alert");	
			Thread.sleep(2000);
			
			clickElement("id","ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_lbFilterShowAll");
			System.out.println("click on ALL in search popup");
			Thread.sleep(10000);
			
			clickElement("id","ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_gvList_ctl03_ibSelect");
			System.out.println("select company");
			Thread.sleep(10000);
			
			driver.switchTo().defaultContent();
			Thread.sleep(8000);
			
			clickElement("id","ctl00_cphContent_bNext");
			System.out.println("Click on Next");
			Thread.sleep(8000);
			
			dropdownByValue("id","ctl00_cphContent_ddStatus","497");
			System.out.println("select Merk value");
			Thread.sleep(5000);
			
			dropdownByValue("id","ctl00_cphContent_ddlModel","2664");
			System.out.println("select Model value");
			Thread.sleep(5000);
			
			insertElement("id","ctl00_cphContent_tbCarType","test");
			System.out.println("value inserted");
			Thread.sleep(5000);

//		}

		/*catch(Exception e){

			//Thread.sleep(15000);
			System.out.println("Unexpected Error");
			logger.info("Unexpected Error");
			//driver.quit();
			//System.out.println("quit done");

		}*/



	}		  
	




	//function completed


	@AfterClass
	public  static void tearDown() throws Exception {

		/*Thread.sleep(15000);
		login.logout();
		System.out.println("logout successfull");
		logger.info("logout successfully");
		Thread.sleep(5000);
		driver.quit();
		Thread.sleep(5000);
		System.out.println("quit done");*/
		System.out.println("ERROR");

		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}


}


