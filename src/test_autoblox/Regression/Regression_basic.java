package test_autoblox.Regression;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.GetCurrentDateTime;
import test_autoblox.excel_datadriven;
import test_autoblox.keywords;

public class Regression_basic extends keywords {

	final static Logger log = Logger.getLogger(Regression_Acceptance.class.getName());
	public static void open_Companylist() throws Exception {

		mouse_move("id","ctl00_mmFS_lnk", "linkText","Bedrijfs beheer" );
		log.info("open company list page");
		System.out.println("open company list page");
		Thread.sleep(2000);
	}
	
	public static void mycar() throws Exception {

		mouse_move("id","ctl00_mmMyCars_lnk", "linkText","Mijn auto's" );
		log.info("mycar page open");
		System.out.println("mycar page open");
		Thread.sleep(2000);
		
	}
	
	public static void Betalingen_payment() throws Exception {

		clickElement("id", "ctl00_mmPayments_lnk");
		log.info("payment page is open");
		System.out.println("payment page is open");
		Thread.sleep(2000);

		
		clickElement("id", "ctl00_cphContent_rbIsInvSndA");
		clickElement("id", "ctl00_cphContent_rbIsInvRcvA");
		clickElement("id", "ctl00_cphContent_rbIsCtA");
		clickElement("id", "ctl00_cphContent_rbIsClosedA");
		clickElement("id", "ctl00_cphContent_rbPaymentStatusA");
		Thread.sleep(2000);
		clickElement("id", "ctl00_cphContent_lnkFilterApply");
		Thread.sleep(10000);
		clickElement("id", "ctl00_cphContent_gvList_ctl03_lnkPDF");
		clickElement("id", "ctl00_cphContent_gvList_ctl03_lbTotalValue");
		
		log.info("select all radio button and select search button also click on pdf button as well as download invoice");
		System.out.println("select all radio button and select search button also click on pdf button as well as download invoice");
	}
	

	public static void systemlog() throws Exception   
	{

		mouse_move("id","ctl00_mmFS_lnk", "linkText","System Log" );
		log.info("open system log");
		System.out.println("open system log");
		Thread.sleep(15000);
		
		GetCurrentDateTime currDt = GetCurrentDateTime.getInstance();
		System.out.println(currDt.getData());
		System.out.println("firsttime display");
    	
    	
		clickElement("xpath", "/html[1]/body[1]/form[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]");
		System.out.println("open log source");
		Thread.sleep(2000);
		clickElement("id", "ctl00_cphContent_lnkSrcCLR");
		System.out.println("clear all");
		clickElement("id", "ctl00_cphContent_lnkSrcSET");
		System.out.println("set all");
		clickElement("id", "ctl00_cphContent_btnApply");
		System.out.println("apply");
		Thread.sleep(2000);
		
		clearElement("id","ctl00_cphContent_tbPeriodB");
        insertElement("id","ctl00_cphContent_tbPeriodB",currDt.getData());
        System.out.println("insert time");
        dropdownByValue("id", "ctl00_cphContent_ddLogLevel", "9");
        System.out.println("select error");
        Thread.sleep(2000);
        clickElement("id", "ctl00_cphContent_ibSearch");
        System.out.println("click on search");
        Thread.sleep(5000);
        
       
       
        String dateid= getText ("xpath","/html[1]/body[1]/form[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]");
        System.out.println("Navigeer pagina: " + dateid);
        
		/*
		String str = dateid;
		String replaceString = str.replace("="," ");
		String replaceString1 = replaceString.replace(","," ");
		String delimiter = " ";

		String[] temp;
		temp = replaceString1.split(delimiter);
		
		String last= temp[10];
		System.out.println(last);*/
        
		        if (dateid.contains("Navigeer pagina")) 
			        {
			        
			//			System.out.println("enter first if");
						String laatste= getText ("id","ctl00_cphContent_gvList_ctl01_gvPager_lnkLast");
						if(laatste.contains("Laatste >>")) 
						{
			//				System.out.println("enter second if");
							log.info("Error on Last Page");
							System.out.println("Error on Last Page");
							clickElement("id","ctl00_cphContent_gvList_ctl01_gvPager_lnkLast");
						}
			        } 
		        else 
			        {
			//        	System.out.println("enter else");
			        	log.info("No Error Data Found");
						System.out.println("No Error Data Found");
					}
       

        }
	


}
