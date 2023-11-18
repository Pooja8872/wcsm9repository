package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOptionMethod {

	public static void main(String[] args) throws InterruptedException {
     
    WebDriver   driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://demoapps.qspiders.com/");
    
    // for dropDown
    Thread.sleep(2000);
    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
    
    //for single select dropDown
  // WebElement dropdown = driver.findElement(By.xpath(""));
   
    
	
	}
	
}
