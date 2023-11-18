package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction {

	public static void main(String[] args) throws InterruptedException {
  WebDriver  driver= new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  driver.get("https://demoapps.qspiders.com/");
	
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.partialLinkText("Double Click")).click();
	
	WebElement Doubleclick = driver.findElement(By.id("btn20"));

	   Actions ac = new Actions(driver);
	   Thread.sleep(2000);
	   ac.doubleClick(Doubleclick).perform();
	   
	  Thread.sleep(2000);
	WebElement Doubleclick1 = driver.findElement(By.id("btn23"));
	 ac.doubleClick(Doubleclick1).perform();
	 
	 Thread.sleep(2000);
	 WebElement Doubleclick2 = driver.findElement(By.id("btn26"));
	 ac.doubleClick( Doubleclick2 ).perform();
	 
	   
	}

}
