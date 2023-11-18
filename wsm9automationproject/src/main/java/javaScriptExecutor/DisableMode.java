package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableMode {

	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		
		//explicit type casing into JSExector
	         JavascriptExecutor  jse=(JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('name').value='Niki'");
		
		//enter the value in username textbox
	    jse.executeScript("document.getElementById('name').value='Pooja'");
	    
	    //Enter the value in email textbox
	    jse.executeScript("document.getElementById('email').value='pooja419@gmail.com'");
	    
	    //Enter the value in passward textbox
	    jse.executeScript("document.getElementById('password').value='123456'");
	    
	    //click on disable registor button
	     WebElement disableregistorbutton = driver.findElement(By.xpath("//button[text()='Register']"));
	     
	     if(disableregistorbutton.isDisplayed())
	    	 
	     {
	    	jse.executeScript("argument[0].click",	disableregistorbutton);
	    	 System.out.println("click");
	     }
	     else
	     {
	    	 
	    	System.out.println("not click");
	     }
	     
	    	 
	    	 
	    	 
	     
        
	}

}
