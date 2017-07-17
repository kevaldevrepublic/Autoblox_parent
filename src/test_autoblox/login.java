package test_autoblox;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import test_autoblox.excel_datadriven;

public class login extends keywords 
{
  private static WebDriver driver;
	private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

	  public static void navigateLogin()  throws Exception 
	  {
	    openURL("https://dev.autoblox.eu/Login.aspx");
        String link = currentURL();
        System.out.println("Open Link -> " + link);
    
	  }
	  
	  public static void navigateLoginacceptance()  throws Exception 
	  {
	    openURL("https://acceptatie.autoblox.eu/Login.aspx");
	    
        String link = currentURL();
        System.out.println("Open Link -> " + link);
        Thread.sleep(5000);
	  }
        
	  
	  public static void  correctLogin()  throws Exception 
        	{
		 
		  excelpath();
         	 String a=excel_datadriven.getCellData(1, 0);
         	 
		/*  for(int i=1; i<20; i++){
			 java.lang.String a = excel_datadriven.getCellData1(i, 0);

			 }*/
       	     String b=excel_datadriven.getCellData(1, 1);
       	     
       	              	
	        clearElement("xpath",".//*[@id='ucLoginSimple_tbLoginName']");
	        insertElement("xpath",".//*[@id='ucLoginSimple_tbLoginName']",a);
	        clearElement("xpath",".//*[@id='ucLoginSimple_tbPassword']");
	        insertElement("xpath",".//*[@id='ucLoginSimple_tbPassword']",b);
	        clickElement("xpath", ".//*[@id='ucLoginSimple_btnLogin']");
	        System.out.println("Done login");
        	}
	  
	  public static void  correctLoginacceptance()  throws Exception 
  	{
	 
	  excelpath();
   	 String a=excel_datadriven.getCellData(5, 0);
   	 
	    String b=excel_datadriven.getCellData(1, 1);
 	     
 	              	
      clearElement("xpath",".//*[@id='ucLoginSimple_tbLoginName']");
      insertElement("xpath",".//*[@id='ucLoginSimple_tbLoginName']",a);
      clearElement("xpath",".//*[@id='ucLoginSimple_tbPassword']");
      insertElement("xpath",".//*[@id='ucLoginSimple_tbPassword']",b);
      clickElement("xpath", ".//*[@id='ucLoginSimple_btnLogin']");
      System.out.println("Done login");
  	}
	  
        public static void  logout()
        {
        	 clickElement("xpath", ".//*[@id='aspnetForm']/div[4]/table[1]/tbody/tr/td/table/tbody/tr[2]/td[7]/a");
        	 System.out.println("Done logout");
        }
               
        public static void closebrowser()  throws Exception 
  	  {
        	driver.close();
          System.out.println("close browser ") ;
      
  	  }
        
        
        
}


