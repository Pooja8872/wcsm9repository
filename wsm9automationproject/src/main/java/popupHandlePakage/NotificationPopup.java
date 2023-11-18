package popupHandlePakage;


import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.service.DriverFinder;

public class NotificationPopup {



	public static void main(String[] args, Object driver) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Browser Value!!");
		String browserValue = sc.next();
		
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notification");
			WebDriver	driver=new ChromeDriver(co);
			
		}
		else if(browserValue.equalsIgnoreCase("FireFox"))
		{
		  FirefoxOptions fo = new FirefoxOptions();
		  fo.addArguments("--disable-notification");
	      WebDriver	driver=new FirefoxDriver(fo);
		}
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			EdgeOptions ed = new EdgeOptions();	
			ed.addArguments("--disable-notification");
		    WebDriver	driver=new EdgeDriver(ed);
			
		}
	
		else 
		{
			System.out.println("Invalid Browser");
			
		}
		
    		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	
         
	
	}


