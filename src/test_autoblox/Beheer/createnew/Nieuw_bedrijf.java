package test_autoblox.Beheer.createnew;

import org.apache.log4j.Logger;
import test_autoblox.*;




public class Nieuw_bedrijf extends keywords 
{

	 
		final static Logger logger = Logger.getLogger(loginsuit.class);
		
		public static void  required_fields () throws Throwable
		 
		{
			test_autoblox.Beheer.Bedrijfs_beheer.clickon_Bedrijfs_beheer();
			
			clickElement("id","ctl00_cphContent_lnkCreateNew");
			
			 excelpath_sheet2();
        	 String a=excel_datadriven.getCellData(3, 0);//being spitBedrijfsnaam: (minimaal 1 karakters)
        	 String b=excel_datadriven.getCellData(3, 1);//Code: (between 1 and 16 characters)
        	 String c=excel_datadriven.getCellData(3, 2);//KvK nummer: (Verplicht veld)
        	 String d=excel_datadriven.getCellData(3, 3);//RDW nummer
        	 String e=excel_datadriven.getCellData(3, 4);//Telefoon: Verplicht veld
        	 String f=excel_datadriven.getCellData(3, 5);//Bezoekadres: minimaal 1 karakters
        	 String g=excel_datadriven.getCellData(3, 6);//Bezoekadres postcode: minimaal 1 karakters
        	 String h=excel_datadriven.getCellData(3, 7);//Bezoekadres plaats: minimaal 1 karakters
        	 String i=excel_datadriven.getCellData(3, 8);//Bezoekadres Land: Mandatory
        	 String j=excel_datadriven.getCellData(3, 9);//Facturen mailen naar
      	     
      	              	
	        clearElement("id","ctl00_cphContent_tbName");
	        insertElement("id","ctl00_cphContent_tbName",a);
	        logger.info("company name inserted");
	        System.out.println("company name inserted");
	      
	        clearElement("id","ctl00_cphContent_tbCode");
	        insertElement("id","ctl00_cphContent_tbCode",b);
	        System.out.println("code inserted");
	        logger.info("code inserted");
	       
	        clearElement("id","ctl00_cphContent_tbKvK");
	        insertElement("id","ctl00_cphContent_tbKvK",c);
	        System.out.println("KVK inserted");
	        logger.info("KVK inserted");
	     
	        clearElement("id","ctl00_cphContent_tbRDWNo");
	        insertElement("id","ctl00_cphContent_tbRDWNo",d);
	        System.out.println("RDW inserted");
	        logger.info("RDW inserted");
	        
	    
	        clearElement("xpath",".//*[contains(@id,'tbPhone')]");
	        insertElement("xpath",".//*[contains(@id,'tbPhone')]",e);
	        System.out.println("phone number inserted");
	        logger.info("phone number inserted");
	
	        clearElement("id","ctl00_cphContent_tbAddrVisitStr");
	        insertElement("id","ctl00_cphContent_tbAddrVisitStr",f);
	        System.out.println("address inserted");
	        logger.info("address inserted");
	        
	
	        clearElement("id","ctl00_cphContent_tbAddrVisitZIP");
	        insertElement("id","ctl00_cphContent_tbAddrVisitZIP",g);
	        System.out.println("zip code inserted");
	        logger.info("zip code inserted");
	
	        clearElement("id","ctl00_cphContent_tbAddrVisitCity");
	        insertElement("id","ctl00_cphContent_tbAddrVisitCity",h);
	        System.out.println("plaats inserted");
	        logger.info("plaats inserted");

	        dropdownByValue("id", "ctl00_cphContent_ddAddrVisitCountry",i);
	       
	        System.out.println("land selected");
	        logger.info("land selected");
	        
	        clearElement("id","ctl00_cphContent_tbInvMailAddr");
	        insertElement("id","ctl00_cphContent_tbInvMailAddr",j);
	        System.out.println("Facturen mailen naar  inserted");
	        logger.info("Facturen mailen naar  inserted");
	        
	        clickElement("id","ctl00_cphContent_btnOK");
	        logger.info("click on save button");
	        
	        Thread.sleep(10000);
	        clickElement("id","ctl00_cphContent_btnOK");
	        logger.info("Again click on save button");
	 
		
	}
}