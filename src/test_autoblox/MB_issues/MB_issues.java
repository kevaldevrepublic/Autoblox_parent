package test_autoblox.MB_issues;

import org.openqa.selenium.WebDriver;

import bsh.This;
import test_autoblox.keywords;

public class MB_issues extends keywords {

	private static WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	public static void navigate_newcar() throws Exception {
		openURL("https://mb.autoblox.eu/NewCar2.aspx");
		String link = currentURL();
		System.out.println("Open Link -> " + link);

	}

	public static void createcar(java.lang.String search_insert) throws Exception {

		String VSB = getText("xpath",
				"html/body/form/div[4]/table[3]/tbody/tr[2]/td[2]/div/div[1]/div[2]/table/tbody/tr[3]/td[2]/table/tbody/tr/td[3]/label");

		System.out.println(VSB);
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_rblHasKenteken_2");
		System.out.println("select vsb");

		/*excelpath_createcar();
		String insert_vsb = excel_datadriven.getCellData(1, 2);*/
		
		
		insertElement("id", "ctl00_cphContent_tbVSB",search_insert );
        System.out.println("VSB inserted:-> " + search_insert);
        Thread.sleep(4000);
      

		clickElement("id", "ctl00_cphContent_bSelectCompany");
		System.out.println("click on Owner Workflow");
		Thread.sleep(5000);

		System.out.println("move on frame");
		Thread.sleep(5000);
		dropdownByValue("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_ddFilterAdminID", "-1");
		System.out.println("select administration Company - All");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_mctlCompanySelection_ucControlLoader_ctl00_gvList_ctl04_ibSelect");
		System.out.println("admin selected");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_rbProtocol_82818");
		Thread.sleep(5000);
		System.out.println("selected admin companyname protocol");

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
		clickElement("xpath",
				"html/body/form/div[4]/table[3]/tbody/tr[2]/td[2]/div/div[1]/div[2]/table[1]/tbody/tr[13]/td[2]/div/div[4]/div[1]");
		System.out.println("date selected");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_rblDashboardMileageUnit_0");
		Thread.sleep(5000);
		System.out.println("km selected");

		clickElement("id", "ctl00_cphContent_rbBTWYes");
		System.out.println("BTW selected");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_bNext");
		Thread.sleep(5000);
		System.out.println("click on next");
		Thread.sleep(5000);
		System.out.println("move to step-3");

		// dropdownByValue("id","ctl00_cphContent_ucProtocolData_0_ucLocation_ddlLastUsed","756025");

		clickElement("id", "ctl00_cphContent_ucProtocolData_0_ucLocation_bSelect");
		Thread.sleep(5000);
		System.out.println("click on search address");

		clickElement("id",
				"ctl00_cphContent_ucProtocolData_0_ucLocation_mctlAddressSelection_ucControlLoader_ctl00_gvList_ctl05_btnSelect");
		Thread.sleep(5000);
		System.out.println("select address");

		System.out.println("address inserted");
		Thread.sleep(10000);
		clickElement("id", "ctl00_cphContent_CarService_imgNewCarService");
		Thread.sleep(5000);
		System.out.println("service popup open");

		clickElement("id",
				"ctl00_cphContent_CarService_mctlCarServiceList_ucControlLoader_ctl00_bSelectCarService_58477");
		Thread.sleep(5000);
		System.out.println("service selected");

		insertElement("id", "ctl00_cphContent_CarService_mctlCarServiceItem_ucControlLoader_ctl00_tbQuantity", "2");
		System.out.println("2 QTY inserted");
		Thread.sleep(5000);

		dropdownByValue("id",
				"ctl00_cphContent_CarService_mctlCarServiceItem_ucControlLoader_ctl00_ddlCompleteBeforeStepId",
				"687648");
		Thread.sleep(5000);
		System.out.println("set workflow step");

		insertElement("id", "ctl00_cphContent_CarService_mctlCarServiceItem_ucControlLoader_ctl00_txtLeadTime", "3");
		Thread.sleep(5000);
		System.out.println("set leadtime");

		clickElement("id", "ctl00_cphContent_CarService_mctlCarServiceItem_ucControlLoader_ctl00_bOk");
		System.out.println("popup close");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_ucScheduledEntry_imgDateS");
		System.out.println("date picker open");
		Thread.sleep(5000);
		clickElement("xpath",
				"html/body/form/div[4]/table[3]/tbody/tr[2]/td[2]/div/div[1]/div[2]/div[2]/div/table/tbody/tr[3]/td[2]/div/div[4]/div[2]");
		System.out.println("date selected");
		Thread.sleep(5000);
		clickElement("id", "ctl00_cphContent_ucScheduledDelivery_imgDateS");
		System.out.println("manually date changed, date picker open");
		Thread.sleep(5000);
		clickElement("xpath",
				"html/body/form/div[4]/table[3]/tbody/tr[2]/td[2]/div/div[1]/div[2]/div[2]/div/table/tbody/tr[4]/td[2]/div/div[4]/div[4]");
		System.out.println("manually date changed");
		Thread.sleep(5000);

		clickElement("id", "ctl00_cphContent_bNext");
		Thread.sleep(5000);
		System.out.println("click on finish");
		Thread.sleep(5000);

		String Finishinfo = getText("id", "ctl00_cphContent_lbFinishInfo");
		System.out.println(Finishinfo);
		System.out.println("VSB/licence number info generated");
		Thread.sleep(5000);

		// search VSB
		String str = Finishinfo;

		String[] tokens = str.split("=");

		String sub = tokens[1];
		String[] p = sub.split(",");
		String VSB1 = p[0];
		System.out.println("VSB is: " + VSB1);

		insertElement("id", "ctl00_tbGlobalSearch", VSB1);
		Thread.sleep(5000);
		clickElement("id", "ctl00_ibGlobalSearch");
		Thread.sleep(10000);
		String VSB2 = multiplewindow();
		System.out.println("VSB2 is: " + VSB2);

	
		
		if(VSB1.equals(VSB2)) {
									System.out.println("VSB1 and VSB2 is equal:");
							}

		else 					{
									System.out.println("VSB1 and VSB2 is not equals:");
			
								}
		

        }	

	

}