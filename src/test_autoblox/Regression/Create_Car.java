package test_autoblox.Regression;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import test_autoblox.keywords;


public class Create_Car extends keywords {

	private static WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	public static void navigate_newcar() throws Exception {
		openURL("https://acceptlive.autoblox.eu/NewCar2.aspx");
		String link = currentURL();
		System.out.println("Open Link -> " + link);
		
		Thread.sleep(10000);
	
	}
	
	public static void searchcar1() throws Exception {
		for (int i = 0; i < 1; i++) 
			
			
        {
           
            		
            		String search_insert = /*"ASD005";*/"ASDgm"+i/* + y + z*/;
            		clearElement("id", "ctl00_tbGlobalSearch");
            		insertElement("id", "ctl00_tbGlobalSearch", search_insert);
            		Thread.sleep(5000);
            		System.out.println("inserted values in search");
            		clickElement("id","ctl00_ibGlobalSearch");
            		System.out.println("click search:->  " + search_insert );
            		Thread.sleep(5000);
            		//boolean IsAlertPresent;
            		{ 
            		    try 
            		    { 
            		    	Alert confirmationAlert = driver.switchTo().alert();
    	            		String alertText = confirmationAlert.getText();
    	            		System.out.println("Alert text is " + alertText);
    	            		confirmationAlert.accept();
    	            		Thread.sleep(5000);
    	            		System.out.println("New create car with this Kenteken:->  " + search_insert );
    	            		navigate_newcar();
	            			createcar(search_insert);
	            			createcar2_BTW();
	            			createcar3();
	            			
	            			System.out.println("\n\n\n**************************************\n\n\n");
	            			
	            			Thread.sleep(5000);
	            			
            		         
            		    }  
            		    catch (NoAlertPresentException Ex) 
            		    { 
            		    	System.out.println("Kenteken is already there");
	            			multiplewindow2();
	            			System.out.println("\n\n\n**************************************\n\n\n");
	            			Thread.sleep(5000);
	            			
            		    }   
            		    
              
                       	
            } 
	
        }
		
	}
	public static void searchcar2() throws Exception {
		for (int i = 0; i < 1; i++) 
			
			
        {
           
            		
            		String search_insert = /*"ASD005";*/"ASDgm"+i/* + y + z*/;
            		clearElement("id", "ctl00_tbGlobalSearch");
            		insertElement("id", "ctl00_tbGlobalSearch", search_insert);
            		Thread.sleep(5000);
            		System.out.println("inserted values in search");
            		clickElement("id","ctl00_ibGlobalSearch");
            		System.out.println("click search:->  " + search_insert );
            		Thread.sleep(5000);
            		//boolean IsAlertPresent;
            		{ 
            		    try 
            		    { 
            		    	Alert confirmationAlert = driver.switchTo().alert();
    	            		String alertText = confirmationAlert.getText();
    	            		System.out.println("Alert text is " + alertText);
    	            		confirmationAlert.accept();
    	            		Thread.sleep(5000);
    	            		System.out.println("New create car with this Kenteken:->  " + search_insert );
    	            		navigate_newcar();
	            			createcar(search_insert);
	            			createcar2_Marge();
	            			createcar3();
	            			
	            			System.out.println("\n\n\n**************************************\n\n\n");
	            			
	            			Thread.sleep(5000);
	            			
            		         
            		    }  
            		    catch (NoAlertPresentException Ex) 
            		    { 
            		    	System.out.println("Kenteken is already there");
	            			multiplewindow2();
	            			System.out.println("\n\n\n**************************************\n\n\n");
	            			Thread.sleep(5000);
	            			
            		    }   
            		    
              
                       	
            } 
	
        }
		
	}
	

	public static void createcar(java.lang.String search_insert) throws Exception {

		
		
		
		clickElement("id", "ctl00_cphContent_rblHasKenteken_0");
		System.out.println("select Kenteken");

		/*excelpath_createcar();
		String insert_vsb = excel_datadriven.getCellData(1, 2);*/
		
		
		insertElement("id", "ctl00_cphContent_tbKenteken",search_insert );
        System.out.println("Kenteken inserted:-> " + search_insert);
        Thread.sleep(4000);
      

		clickElement("id", "ctl00_cphContent_bSelectCompany");
		System.out.println("click on Owner Workflow");
		Thread.sleep(5000);

		System.out.println("move on frame");
		Thread.sleep(5000);

		dropdownByValue("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_ddFilterAdminID", "-1");
		System.out.println("select administration Company - All");
		Thread.sleep(5000);
				
		insertElement("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_tbSearch","Testkoper Moeder Orakel");
        System.out.println("Enter company name in search:-> " + "Testkoper Moeder Orakel");
        Thread.sleep(4000);
        					
        clickElement("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_ibSearchS");
        System.out.println("Click on Search");
		
        
        clickElement("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_gvList_ctl03_ibSelect");
        System.out.println("select company: " + " Testkoper Moeder Orakel");
        
        
		clickElement("id", "ctl00_cphContent_rbProtocol_91195");
		Thread.sleep(5000);
		System.out.println("select company Workflow protocol");

		dropdownByValue("id", "ctl00_cphContent_ddlRetrieveDataFrom", "-1");
		System.out.println("select Do not retrieve car data");
		Thread.sleep(5000);
		
		clickElement("id", "ctl00_cphContent_bPrev");
		Thread.sleep(5000);
		System.out.println("click on Previous");
		
		clickElement("id", "ctl00_cphContent_bNext");
		Thread.sleep(5000);
		System.out.println("click on next");
		Thread.sleep(5000);
		
		System.out.println("move to step-2");

		dropdownByValue("id", "ctl00_cphContent_ddlBrand", "497");
		Thread.sleep(5000);
		System.out.println("first dropdown selected");
		
		dropdownByValue("id", "ctl00_cphContent_ddlModel", "2618");
		Thread.sleep(5000);
		System.out.println("second dropdown selected");
		
		insertElement("id", "ctl00_cphContent_tbCarType", "test");
		System.out.println("test inserted");
		Thread.sleep(5000);
								
		clickElement("id", "ctl00_cphContent_dsDateFirstRegINT_imgDateS");
		Thread.sleep(5000);											
		clickElement("xpath","/html[1]/body[1]/form[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[13]/td[2]/div[1]/div[4]/div[1]");
		System.out.println("date selected");
		Thread.sleep(5000);
		
		clickElement("id", "ctl00_cphContent_dsDateKenteken_imgDateS");
		Thread.sleep(5000);	  								
		clickElement("xpath","/html[1]/body[1]/form[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[13]/td[4]/div[1]/div[5]/div[4]");
		System.out.println("date selected");
		Thread.sleep(5000);
		
		clickElement("id", "ctl00_cphContent_rblDashboardMileageUnit_0");
		Thread.sleep(5000);
		System.out.println("km selected");
		}
	
		public static void createcar2_BTW() throws Exception {
			clickElement("id", "ctl00_cphContent_rbBTWYes");
			System.out.println("BTW selected");
			Thread.sleep(5000);
			}
		
		public static void createcar2_Marge() throws Exception {
			clickElement("id", "ctl00_cphContent_rbBTWNo");
			System.out.println("Marge selected");
			Thread.sleep(5000);
			}
		
		public static void createcar3() throws Exception {
		
		
		
		insertElement("id", "ctl00_cphContent_tbBPM", "123");
		System.out.println("BPM Entered");
		Thread.sleep(5000);
		
		
		clickElement("id", "ctl00_cphContent_bNext");
		Thread.sleep(5000);
		System.out.println("click on next");
		Thread.sleep(5000);
		System.out.println("move to step-3");

		// dropdownByValue("id","ctl00_cphContent_ucProtocolData_0_ucLocation_ddlLastUsed","756025");

		dropdownByValue("id", "ctl00_cphContent_ucProtocolData_0_ucLocation_ddlLastUsed", "1030789");
		Thread.sleep(5000);
		System.out.println("address selected");

		clickElement("id", "ctl00_cphContent_bNext");
		Thread.sleep(5000);
		System.out.println("click on finish");
		Thread.sleep(5000);

		
		String Finishinfo = getText("id", "ctl00_cphContent_lbFinishInfo");
		System.out.println(Finishinfo);
		System.out.println("licence number info generated");
		Thread.sleep(5000);

		// search VSB
		String str = Finishinfo;

		String[] tokens = str.split("=");

		String sub = tokens[1];
		String[] p = sub.split(",");
		String Kenteken = p[0];
		System.out.println("Kenteken is: " + Kenteken);

		insertElement("id", "ctl00_tbGlobalSearch", Kenteken);
		Thread.sleep(5000);
		clickElement("id", "ctl00_ibGlobalSearch");
		Thread.sleep(10000);
		multiplewindowpopup();
		}
		
		public static  java.lang.String  multiplewindowpopup() throws Exception
		{
			{
				//driver.get();
				String parentWindowHandle = driver.getWindowHandle();
				System.out.println("Parent window's handle -> " + parentWindowHandle);
				

				java.util.Set<String> allWindowHandles = driver.getWindowHandles();
				String lastWindowHandle = "";


					for(String handle : allWindowHandles)
					{
						System.out.println(handle);
						if (handle.equals(parentWindowHandle)== false)
						{
		
									System.out.println("Switching to window - > " + handle);
									System.out.println("Navigating to vsb/Kenteken details");
									driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
									//System.out.println("switching handle");
								
									Thread.sleep(10000);
		
									
									
									
									
									
									
									
								
							        
							        driver.close();
									
									driver.switchTo().window(parentWindowHandle);
									System.out.println("window close, move to parent");
	
						}
					}
				}
			return null;
		}

  }	

		

