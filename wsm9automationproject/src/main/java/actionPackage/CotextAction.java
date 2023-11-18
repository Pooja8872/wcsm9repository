package actionPackage;

import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CotextAction {

	
	public static void main(String[] arg  ) throws InterruptedException {
		 
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	
	driver.findElement(By.partialLinkText("Right Click")).click();
	
	WebElement rightclick = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
			
	  Actions act= new Actions(driver);
	  Thread.sleep(2000);
	  act.contextClick(rightclick).perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[text()='Yes']")).click();
	  
	  WebElement rightclick1 = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
	  act.contextClick(rightclick1).perform();
	  
	  
	  WebElement rightclick2 = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
	    act.contextClick(rightclick2).perform();
	
	}
	  
	}

	

	
	
	
	

	