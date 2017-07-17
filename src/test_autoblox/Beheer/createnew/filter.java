package test_autoblox.Beheer.createnew;

import org.apache.log4j.Logger;
import test_autoblox.*;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class filter extends keywords 
{

	 
		final static Logger logger = Logger.getLogger(loginsuit.class);
		private static final java.lang.String baseUrl = null;
		
		public static void  filter_click  () throws Exception
		 
		{
			//driver.get(baseUrl + "/CompanyListFilter.aspx");
			clickElement("linkText" ,"Toon alles");
			//clickElement("id","ctl00_cphContent_lbFilterShowAll");
		       
	        logger.info("clicked on Toon alles");
	        System.out.println("clicked on Toon alles");
	      
	        dropdownByValue("id", "ctl00_cphContent_ddFilterAdminID","-1");
	        logger.info("clicked on Admin Company select all");
	        System.out.println("clicked on Admin Company select all");
	        
	        dropdownByValue("id", "ctl00_cphContent_ddlCompanyStatus","-1");
	        logger.info("clicked on  Bedrijfstatus? select all");
	        System.out.println("clicked on  Bedrijfstatus? select all");
	        
	        dropdownByValue("id", "ctl00_cphContent_ddlBuyerGroup","-1");
	        logger.info("clicked on  Kopersgroep select all");
	        System.out.println("clicked on  Kopersgroep select all");
	        
	        clickElement("xpath",".//*[@id='ctl00_cphContent_gvList_ctl02_lnkHdrCompanyName']");
			
			
			   
			    //clickElement("id","ctl00_cphContent_lbFilterShowAll");
			    //clickElement("id","ctl00_cphContent_lbFilterShowAll");
			/*clickElement("linkText" ,"Toon alles");
			logger.info("clicked on Toon alles");
	        System.out.println("clicked on Toon alles");  
			    
			    new Select(driver.findElement(By.id("ctl00_cphContent_ddFilterAdminID"))).selectByVisibleText("Alle bedrijven");
			    
			    clickElement("cssSelector","option[value=\"-1\"]");
			    logger.info("clicked on first filter");
		        System.out.println("clicked on first filter");  
			    
			    
			    new Select(driver.findElement(By.id("ctl00_cphContent_ddlCompanyStatus"))).selectByVisibleText("Alle bedrijven");
			    
			  
			    clickElement("cssSelector","#ctl00_cphContent_ddlCompanyStatus > option[value=\"-1\"]");
			    logger.info("clicked on second filter");
		        System.out.println("clicked on second filter");  
			    
			    
			    new Select(driver.findElement(By.id("ctl00_cphContent_ddlBuyerGroup"))).selectByVisibleText("Alle groepen");
			    
			    clickElement("cssSelector","#ctl00_cphContent_ddlBuyerGroup > option[value=\"-1\"]");
			    logger.info("clicked on third filter");
		        System.out.println("clicked on third filter");  
			    
			    
			    clickElement("id","ctl00_cphContent_gvList_ctl02_lnkHdrCompanyName");
			    logger.info("sort1");
		        System.out.println("sort1");  
			    clickElement("id","ctl00_cphContent_gvList_ctl02_lnkHdrCompanyName");
			    logger.info("sort2");
		        System.out.println("sort2");  */

		
	}
}
