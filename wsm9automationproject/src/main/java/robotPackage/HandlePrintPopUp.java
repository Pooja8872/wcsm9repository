package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePrintPopUp {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		
		//generate print pop up
		
		Robot robot = new Robot();
		
		//press ctrl+p
		robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_P);
	
         Thread.sleep(2000);
         //release ctrl+p
         robot.keyRelease(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
         
         Thread.sleep(2000);
         //Handle print pop up
         robot.keyPress(KeyEvent.VK_TAB);
         robot.keyRelease(KeyEvent.VK_ENTER);
         
         Thread.sleep(2000);
         driver.quit();
         

	
	}

}
