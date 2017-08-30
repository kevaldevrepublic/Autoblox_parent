package test_autoblox.Mijn_gegevens;

import java.io.IOException;

import test_autoblox.keywords;

public class Gebruikergegevens extends keywords {


	public static void  clickon_Gebruikergegevens() throws Exception 
	{
		
		mouse_move("id","ctl00_mmMyData_lnk", "linkText","Gebruikergegevens" );
		System.out.println("click on user menu data popup");
		driver.switchTo().frame("ctl00_ucModalFrame_mfFrame");
		System.out.println("open popup");
		clickElement("linkText" ,"Berichten"); 
		System.out.println("click on  Berichten");
		clickElement("id","ctl_ucNotifications_lbtRefreshGrid");
		System.out.println("click on  refresh");
		
		clickElement("id","ctl_btnResetPassword");
		System.out.println("click on  reset password");
		driver.switchTo().alert().accept();
		
		//clickElement("id","ctl_ucNotifications_lbtRefreshGrid");
		//System.out.println("click on  refresh");
		
		
		/*clickElement("xpath",".//*[@id='ctl_ucNotifications_gvList_ctl03_imgMailURL']");
		System.out.println("click on  mail icon");
		driver.switchTo().frame("ctl00_ucModalFrame_mfFrame");
		System.out.println("open new window");
		driver.close();
		System.out.println("close new window");*/
		//Runtime.getRuntime().exec("F:\\fileupload.exe");
		//Runtime.getRuntime().exec("F:\\fileupload.exe");
		//Thread.sleep(15000);
		
		clickElement("id","lnkModalCancel");
		System.out.println("close user popup");
	
	}
}