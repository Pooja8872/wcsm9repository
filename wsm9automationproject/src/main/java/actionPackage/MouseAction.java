package actionPackage;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.bluestone.com/");
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	
	WebElement watchjewellery = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	    
	   //By using mouse action
        Actions act = new Actions (driver);
	    Thread.sleep(2000);
	    act.moveToElement(watchjewellery ).perform();
	   
	    driver.findElement(By.partialLinkText("Band")).click();
	   
	
    
	
	
	
	//use action class mouseAction
	       
	
	
	 //if(driver.findElement(By.xpath("//h1[text()='lakshigoldcoins"]")).isDisplayed());
	//{
	//System.out.println("text displayed");
	//}
	}

}
