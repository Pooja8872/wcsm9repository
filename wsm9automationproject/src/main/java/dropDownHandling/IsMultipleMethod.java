package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/");
	
	 // for dropDown
    Thread.sleep(2000);
    driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
    
    //for single select dropDown
    WebElement dropdown = driver.findElement(By.xpath("//label[text()='Phone Number']/following-sibling::section"));
   
       
         //for multiple select dropDown
         Thread.sleep(2000);
         driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
         
        WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
        Select sel2 = new Select(dropdown2);
       boolean status2 = sel2.isMultiple();
       System.out.println(status2);
        
        
         
         
	
	
	}

}
