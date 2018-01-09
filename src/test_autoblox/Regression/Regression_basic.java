package test_autoblox.Regression;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

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
	

	public static void systemlog() throws Exception   {

		mouse_move("id","ctl00_mmFS_lnk", "linkText","System Log" );
		log.info("open system log");
		System.out.println("open system log");
		Thread.sleep(2000);
		
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
	}
	
	
}
