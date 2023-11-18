package popupHandlePakage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='Authentication']")).click();
        
        //Address of authentication page window
       String authenticatepagewindowhandle = driver.getWindowHandle();
       Thread.sleep(2000);
        
        driver.findElement(By.xpath("//a[text()='Login']")).click();
        
        Thread.sleep(2000);
      //  get the address of all present window
       Set<String> allWindowHandles = driver.getWindowHandles();
       
       //shift controls to to authentication pop up
	  for(String wh:allWindowHandles)
	  {
		  if(!authenticatepagewindowhandle.equals(wh))
		  {
			  driver.switchTo().window(wh);
		  }
	  }
	}
	  //handle authentication pop up
	  
	    public static void handle_authentication_pop_up()
	    
	 {
		Robot robot = new Robot() ;
		
		robot.keyPress(KeyEvent.VK_A);
		robot.keyPress(KeyEvent.VK_D);
		 
			 
		 
		 
	 }
	 
}	 
	
}
	


	
}
