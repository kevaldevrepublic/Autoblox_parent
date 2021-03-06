
package test_autoblox;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.RETURN;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import java.util.Set;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class keywords {

	private static final String String = null;
	public static  WebDriver driver;

	public static By Byelement (String Type, String Path)
	{
		if (Type.equals("id"))
		{
			return By.id(Path);
		}
		else if (Type.equals("className"))
		{
			return By.className(Path);
		}
		else if (Type.equals("name"))
		{
			return By.name(Path);
		}
		else if (Type.equals("PartialLinkText"))
		{
			return By.name(Path);
		}

		else if (Type.equals("xpath"))
		{
			return By.xpath(Path);
		}
		else if (Type.equals("tagName"))
		{
			return By.tagName(Path);
		}
		else if (Type.equals("cssSelector"))
		{
			return By.cssSelector(Path);
		}

		else if (Type.equals("linkText"))
		{
			return By.linkText(Path);
		}
		/*else if (Type.equals("link"))
		{
			return By.linkText(Path);
		}*/

		else
		{
			return By.id(Path);
		}
	}
	public static void clickElement(String Type,String Path)
	{
		driver.findElement(Byelement(Type, Path)).click(); 	
	}
	public static WebElement calldriver(String Type,String Path)
	{
		return driver.findElement(Byelement(Type, Path)); 	
	}

	public static java.lang.String getmessage(String Type,String Path)
	{
		return driver.findElement(Byelement(Type, Path)).getText();

	}


	public static void checkbox_selection(String Type,String Path)throws Exception
	{

		if(driver.findElement(Byelement(Type, Path)).isSelected())
		{
			System.out.println("checkbox is not selected");
			driver.findElement(Byelement(Type, Path)).click();
			System.out.println("Now checkbox is selected");
		}
		else if(driver.findElement(Byelement(Type, Path)).isSelected())
		{
			System.out.println("checkbox is selected");


		}
		
	}
	public static void clearElement(String Type,String Path)
	{
		driver.findElement(Byelement(Type, Path)).clear(); 	
	}
	public static void insertElement(String Type,String Path,String key)
	{
		driver.findElement(Byelement(Type, Path)).sendKeys(key);	
	}
	public static WebElement hover(String Type,String Path)
	{
		return driver.findElement(Byelement(Type, Path));
	}
	public static void hoverclick(String Type,String Path)
	{
		driver.findElement(Byelement(Type, Path)).click(); 
	}
	public static  void excelpath()throws Exception
	{
		excel_datadriven.setExcelFile("D:\\Keval\\Data\\Selenium\\Scripts\\live\\Autoblox_parent\\src\\excel_datadriven\\datadrivenExcel1.xlsx", "Sheet1");

	}
	public static  void excelgetcardata()throws Exception
	{
		excel_datadriven.setExcelFile("D:\\\\Keval\\\\Data\\\\Projects\\\\Keval\\\\AutoBLOX\\\\Documents\\\\car_numbers_details.xlsx", "Sheet3");

	}
	
	public static  void excelpath_createcar()throws Exception
	{
		excel_datadriven.setExcelFile("D:\\Keval\\Data\\Selenium\\Scripts\\live\\Autoblox_parent\\src\\excel_datadriven\\createcar_details.xlsx", "Sheet1");

	}
	
	public static  void excelpath_sheet2()throws Exception
	{
		excel_datadriven.setExcelFile("D:\\Keval\\Data\\Selenium\\Scripts\\live\\Autoblox_parent\\src\\excel_datadriven\\datadrivenExcel.xlsx", "Sheet2");

	}

	public static  java.lang.String dev_20_excelpath_sheet1()throws Exception
	{
		excel_datadriven.setExcelFile("D:\\Keval\\Data\\Selenium\\Scripts\\live\\Autoblox_parent\\src\\excel_datadriven\\datadrivenExcel.xlsx", "Sheet2");
		return null;

	}


	public static void refresh()
	{
		driver.navigate().refresh();
	}
	public static void back()
	{
		driver.navigate().back();
	}
	public static void forward()
	{
		driver.navigate().forward();
	}
	public static Alert alertSwitch()
	{
		return driver.switchTo().alert();
	}
	public static String getAtribute(String Type, String Path, String Value)
	{
		return driver.findElement(Byelement(Type, Path)).getAttribute(Value);
	}
	public static String get_all_tabel_data(String Type, String Path, String Value)
	{
		return driver.findElement(Byelement(Type, Path)).getAttribute(Value);
	}

	public static void submitForm(String Type,String Path)
	{
		driver.findElement(Byelement(Type, Path)).submit();
	}
	public static  void setFirefoxDriver(WebDriver dri) //for all browsers
	{
		driver = dri;

	}
	public static  void setchromeDriver(WebDriver dri) //for all browsers
	{
		driver = dri;

	}

	public static void closeWindow()
	{
		driver.quit();
	}
	public static void chromeDriver1() throws Exception
	{
		String exePath = "D:\\Keval\\Data\\Selenium\\latest_chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}


	public static  Object openURL(String url) throws Exception
	{
		driver.get(url);
		return null;

	}
	public static String currentURL()
	{
		return driver.getCurrentUrl();

	}
	public static String getText(String Type,String Path)
	{
		return driver.findElement(Byelement(Type, Path)).getText();
	}
	public static WebElement webElementClass(String Type, String Path)
	{
		return driver.findElement(Byelement(Type, Path));
	}
	public static void actionClass(WebElement string2)
	{

		Actions action = new Actions(driver);
		action.moveToElement(string2).build().perform();
	}
	
	/*public static void mousemove()
	 {

		WebElement element = driver.findElement(Byelement(String, String));

        Actions action = new Actions(driver);

        action.moveToElement(element).build().perform();

        driver.findElement(Byelement(String, String)).click();
	 }
*/
	 public static  void mouse_move(String Type , String Path, String Type2, String Path2) throws Exception 
    	{
    		WebElement element = driver.findElement(Byelement(Type, Path)); 
    				
            Actions action = new Actions(driver);

            action.moveToElement(element).perform();

            WebElement subElement = driver.findElement(Byelement(Type2, Path2));
            		
            action.moveToElement(subElement);

            action.click();

            action.perform();
    	}
	
	public static  void WebDriverWait(String Type, String Path)
	{

		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Byelement(Type, Path)));	  
	}
	public static  String multiplewindow() throws Exception
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
					//
					Thread.sleep(5000);
					
					
					
					//clickElement("id", "ucCarDetails_tbsCarDetails_tbbBasicInfo_bTab");
					Thread.sleep(5000);
					
					String Kentekendetails = getText ("xpath","/html[1]/body[1]/form[1]/div[3]/div[1]");
					//String VSBdetails1 = getText ("xpath","//*[@id:pnlTOP][][@class,'cModalHeader']");
					System.out.println(Kentekendetails);
					
					//String VSBdetails2 = getText("xpath","//div[starts-with(text(),VSB)]");
					//System.out.println(VSBdetails2);
					
					String str = Kentekendetails;
			        
					   String[] tokens = str.split(" ");
				
				        String sub = tokens[1];
				        String[] p = sub.split(",");
				        String Kenteken = p[0];
				        System.out.println(Kenteken);
				        Thread.sleep(3000);
				        
				        driver.close();
						
						driver.switchTo().window(parentWindowHandle);
						System.out.println("window close, move to parent");
				        //return VSB;
				       
					
					//lastWindowHandle = handle;
					
				}
			}

			//Switch to the parent window
			
			//close the parent window

			//at this point there is no focused window, we have to explicitly switch back to some window.
			//driver.switchTo().window(lastWindowHandle);
			//driver.get("http://www.yepme.com/");
			// ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
		}
		return null;
	}
	public static  String multiplewindow2() throws Exception
	{
		{
			//driver.get();
			String parentWindowHandle = driver.getWindowHandle();
			//System.out.println("Parent window's handle -> " + parentWindowHandle);
			

			java.util.Set<String> allWindowHandles = driver.getWindowHandles();
			String lastWindowHandle = "";


			for(String handle : allWindowHandles)
			{
				//System.out.println(handle);
				if (handle.equals(parentWindowHandle)== false)
				{

					
					driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
					//System.out.println("switching handle");

				        driver.close();
						System.out.println("window close");

				}
			}

			
			driver.switchTo().window(lastWindowHandle);
		
		}
		return null;
	}
	public static void dropdownByIndex(String Type, String path, int Index) 
	{  
		Select select = new Select (driver.findElement(Byelement(Type, path)));  
		select.selectByIndex(Index);  
		select.getOptions();  
		//select.selectByValue(arg0);  
		//select.deselectByVisibleText(arg0); 
	} 
	public static void dropdownByText(String Type, String path, String Text) 
	{  
		Select select = new Select (driver.findElement(Byelement(Type, path)));  
		//select.selectByIndex(Index);  
		select.getOptions();  
		//select.selectByValue(arg0);  
		select.selectByVisibleText(Text); 
	}  

	public static void window_handle() 
	{  
		String handle= driver.getWindowHandle();
		System.out.println(handle);

	}  

	public static void dropdownByValue(String Type, String path, String Value) 
	{  
		Select select = new Select (driver.findElement(Byelement(Type, path)));  
		//select.selectByIndex(Index);  
		select.getOptions();  
		select.selectByValue(Value);  
		//select.selectByVisibleText(Value); 
	}
}




