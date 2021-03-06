package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import test_autoblox.keywords;

public class GetCurrentDateTime extends keywords{
	
	private String data;
	private static GetCurrentDateTime me = null;
	
	private GetCurrentDateTime() {
		this.setCurrentData();
	}
	
	public static GetCurrentDateTime getInstance() {
		if(me == null) {
			me = new GetCurrentDateTime();
		}
		return me;
	}
	
	public void setData(String newData) {
    	this.data = newData; 
	}
	
	public void setCurrentData() {
    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
    	LocalDateTime now = LocalDateTime.now();  
    	this.data = (dtf.format(now)); 
	}
	
	public String getData() {
		return this.data;
	}
	
	public static void main(String []args) throws InterruptedException {
		GetCurrentDateTime sd = GetCurrentDateTime.getInstance();
		System.out.println(sd.getData());
		Thread.sleep(2000);
		/*sd.setData();
		System.out.println(sd.getData());

		
		Thread.sleep(2000);
		StoreDate sd2 = StoreDate.getInstance();
		System.out.println(sd2.getData());*/

	}
}
