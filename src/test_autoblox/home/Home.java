package test_autoblox.home;

import test_autoblox.*;




public class Home extends keywords {
	 	
	

		public static void  clickhome()  throws Exception 
		{
		      	
		clickElement("xpath","//a[contains(@href,'/CarStepSummary.aspx')]");
		System.out.println("Click on home button from menubar");
		currentURL();    
		
		}
}





