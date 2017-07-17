
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
		
		if(driver.findElement(Byelement(Type, Path)).isSelected()){
			System.out.println("checkbox is not selected");
			driver.findElement(Byelement(Type, Path)).click();
		}else if(driver.findElement(Byelement(Type, Path)).isSelected()){
			System.out.println("checkbox is selected");
			
			
		}else{
			return;
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
	  
		WebElement element = driver.findElement(Byelement(String));
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).build().perform();
 
        driver.findElement(Byelement(String, String)).click();
	 }*/
	
	public static  void WebDriverWait(String Type, String Path)
	 {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Byelement(Type, Path)));	  
	 }
	public static  void multiplewindow() throws Exception
	{
		{
		      //driver.get();
		        String parentWindowHandle = driver.getWindowHandle();
		        System.out.println("Parent window's handle -> " + parentWindowHandle);
		        WebElement clickElement = driver.findElement(By.id("button1")); 

		        //for(int i = 0; i < 3; i++)
		        //{
		            //clickElement.click();
		            //Thread.sleep(3000);
		        //}

		        java.util.Set<String> allWindowHandles = driver.getWindowHandles();
		        String lastWindowHandle = "";
		      
		    
		        for(String handle : allWindowHandles)
		        {
		            System.out.println(handle);
		            if (handle.equals(parentWindowHandle)== false)
		            {
		                
		            System.out.println("Switching to window - > " + handle);
		            System.out.println("Navigating to google.com");
		            driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		            
		            Thread.sleep(3000);
		            clearElement("id","email");
			        
			        insertElement("id","email","qadevrepublic1@gmail.com");
			        
			        clearElement("id","pass");
			        
			        insertElement("id","pass","DevHero@123");
			        
			        clickElement("id", "loginbutton");
		            //driver.get("http://google.com");
		            lastWindowHandle = handle;
		            driver.close();
		            }
		        }

		        //Switch to the parent window
		        //driver.switchTo().window(parentWindowHandle);
		        //close the parent window
		        
		        //at this point there is no focused window, we have to explicitly switch back to some window.
		        driver.switchTo().window(lastWindowHandle);
		        //driver.get("http://www.yepme.com/");
		    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
		  }
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

	
	

