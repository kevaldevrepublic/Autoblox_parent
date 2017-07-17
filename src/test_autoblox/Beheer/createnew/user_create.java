package test_autoblox.Beheer.createnew;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;

import test_autoblox.*;

public class user_create extends keywords {

	final static Logger logger = Logger.getLogger(loginsuit.class);
	public static void  new_user_admin () throws Exception
	 
	
	
	{
		clickElement("linkText" ,"Toon alles");
		System.out.println("filter done");
		
		clickElement("xpath" ,".//*[@id='ctl00_cphContent_gvList_ctl04_lnkCompanyName']");
		System.out.println("click on manan test");
		
		clickElement("xpath" ,"//a[contains(@id,'tbbUsers_bTab')]");
		System.out.println("click in user tab");
		
		clickElement("id" ,"ctl00_cphContent_ucUsers_lbtNewUser");
		System.out.println("create new user");
		

		
	}
	
public static void  edit_user () throws Exception
	 
	
	
	{
		clickElement("linkText" ,"Toon alles");
		System.out.println("filter done");
		
		clickElement("xpath" ,".//*[@id='ctl00_cphContent_gvList_ctl04_lnkCompanyName']");
		System.out.println("click on manan test");
		
		clickElement("xpath" ,"//a[contains(@id,'tbbUsers_bTab')]");
		System.out.println("click in user tab");
		
	
		
	}
	
	
	public static void  required_fields () throws Exception
	 
	{
	
		
		clickElement("xpath" ,"//a[contains(.,'Basis info')]"); 
        	System.out.println("click on basic info");
    
	excelpath_sheet2();
	 String a=excel_datadriven.getCellData(11, 0);//user name
	 
	 String c=excel_datadriven.getCellData(11, 2);//First name
	 
	 String e=excel_datadriven.getCellData(11, 4);//Last name
	
	 String g=excel_datadriven.getCellData(11, 6);//e-mail

	   clearElement("xpath",".//*[@id='ctl_tbLoginName']");
	   insertElement("xpath",".//*[@id='ctl_tbLoginName']",a);
	   logger.info("user name inserted");
	   System.out.println("user name inserted");
	 
	   
	   clearElement("xpath",".//*[@id='ctl_tbFirstName']");
	   insertElement("xpath",".//*[@id='ctl_tbFirstName']",c);
	   logger.info("first name inserted");
	   System.out.println("login user name inserted");    
	              	
	   clearElement("xpath",".//*[@id='ctl_tbLastName']");
	   insertElement("xpath",".//*[@id='ctl_tbLastName']",e);
	   logger.info("last name inserted");
	   System.out.println("last name inserted");
	   
	   
	   clearElement("xpath",".//*[@id='ctl_tbEmail']");
	   insertElement("xpath",".//*[@id='ctl_tbEmail']",g);
	   logger.info("email inserted");
	   System.out.println("email inserted");
	   
	   clickElement("xpath" ,".//*[@id='ctl_btnOK']");
	  	      
	   System.out.println("click on ok button");
	    

}
		
	public static void  Allfields () throws Exception
	 
	{
		
		
		
		
	excelpath_sheet2();
	 String a=excel_datadriven.getCellData(11, 0);//user name
	 //String b=excel_datadriven.getCellData(11, 1);//select sir/madam
	 String c=excel_datadriven.getCellData(11, 2);//First name
	 String d=excel_datadriven.getCellData(11, 3);//insertion
	 String e=excel_datadriven.getCellData(11, 4);//Last name
	 String f=excel_datadriven.getCellData(11, 5);//Date of birth
	 String g=excel_datadriven.getCellData(11, 6);//e-mail
	 String h=excel_datadriven.getCellData(11, 7);//Direct number
	 String i=excel_datadriven.getCellData(11, 8);//GSM
	 String j=excel_datadriven.getCellData(11, 9);//Function
	     
	              	
   clearElement("xpath",".//*[@id='ctl_tbLoginName']");
   insertElement("xpath",".//*[@id='ctl_tbLoginName']",a);
   logger.info("user name inserted");
   System.out.println("user name inserted");
 
   checkbox_selection("xpath",".//*[@id='ctl_rblUserGender_0']");
   logger.info("Sir selecteded");
   System.out.println("Sir selecteded");
   
   clearElement("xpath",".//*[@id='ctl_tbFirstName']");
   insertElement("xpath",".//*[@id='ctl_tbFirstName']",c);
   logger.info("first name inserted");
   System.out.println("login user name inserted");
   
   clearElement("xpath",".//*[@id='ctl_tbPrefix']");
   insertElement("xpath",".//*[@id='ctl_tbPrefix']",d);
   logger.info("insertion inserted");
   System.out.println("insertion inserted");
   
   clearElement("xpath",".//*[@id='ctl_tbLastName']");
   insertElement("xpath",".//*[@id='ctl_tbLastName']",e);
   logger.info("last name inserted");
   System.out.println("last name inserted");
   
   clearElement("xpath",".//*[@id='ctl_ucBirthDate_tbDate']");
   insertElement("xpath",".//*[@id='ctl_ucBirthDate_tbDate']",f);
   logger.info("birthdate inserted");
   System.out.println("birthdate inserted");
   
   clearElement("xpath",".//*[@id='ctl_tbEmail']");
   insertElement("xpath",".//*[@id='ctl_tbEmail']",g);
   logger.info("email inserted");
   System.out.println("email inserted");
   
   clearElement("xpath",".//*[@id='ctl_tbDirectPhone']");
   insertElement("xpath",".//*[@id='ctl_tbDirectPhone']",h);
   logger.info("direct phone number inserted");
   System.out.println("direct phone number inserted");

   clearElement("xpath",".//*[@id='ctl_tbCellPhone']");
   insertElement("xpath",".//*[@id='ctl_tbCellPhone']",j);
   logger.info("cell number inserted");
   System.out.println("cell number inserted");
   
   clearElement("xpath",".//*[@id='ctl_tbUserFunction']");
   insertElement("xpath",".//*[@id='ctl_tbUserFunction']",i);
   logger.info("function inserted");
   System.out.println("function inserted");
   
   clickElement("xpath" ,".//*[@id='ctl_btnOK']");
   System.out.println("click on ok button");
    
	}

	public static void  admin_assign () throws Exception
	 
	{
	
		/* String a = currentURL();
		System.out.println(a);
		logger.info("current url");*/
		
		clickElement("xpath" ,"//a[contains(.,'Basis info')]"); 
    	System.out.println("click on basic info");
		clickElement("linkText" ,"Gebruikersrechten"); 
		//clickElement("xpath" ,"//a[contains(.,'Gebruikersrechten')]"); 
    	System.out.println("click on Gebruikersrechten");
    	logger.info("click on Gebruikersrechten ");
		
		
		clickElement("id" ,"ctl_btnEdit"); 
		System.out.println("click on edit user and assign admin ");
		logger.info("click on edit user and assign admin ");
		
		Thread.sleep(2000);
		
		//checkbox_selection("xpath",".//*[@id='ctl_pnlRoles']/table/tbody/tr[2]/td[1]/span[1]");
								
		clickElement("xpath",".//*[@id='ctl_Role000001']");
		
		//clickElement("name","ctl$Role000001");
		System.out.println("check on Administrator");
		logger.info("check on Administrator ");
		
		clickElement("id" ,"ctl_btnOK"); 
		System.out.println("save data");
		
		/*try {
			a= driver.switchTo().alert().getText();
			System.out.println(a);
			logger.info("alert message insert phone number");
			} catch (Exception e) 
			{
			driver.switchTo().alert().accept();
			// TODO: handle exception
			}*/
		
		clickElement("id" ,"ctl_btnOK"); 
		System.out.println("close popup");
		logger.info("close popup");
		//Thread.sleep(5000);
		//refresh();
		
		
		//clickElement("xpath" ,"//input[contains(@id,'btnOK')]");
		//System.out.println("close company details page nad move to list page");
		//logger.info("close company details page nad move to list page");
	}
		
		

	 
}
