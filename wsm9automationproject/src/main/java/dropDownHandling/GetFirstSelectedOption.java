package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/ADMIN/Desktop/wcsm%20webelement/dropdownMultiple.html");
    
	//single select dropDown
	WebElement dropDown = driver.findElement(By.id("iddM"));
	
	//handle the dropDown
    Select	sel=new Select (dropDown);
    
    //select the option from dropDown
    Thread.sleep(2000);
    sel.selectByValue("v7");
    Thread.sleep(2000);
    
    //get the option which is the first
  // WebElement firstOpt=sel.getFirstSelectedOption();  
   
   //get the text of first option
   //System.out.println(firstOpts.getText());
   
   //multiSelect dropDown
   
   //Thread.sleep(2000);
   //driver.navigate().to("");
   
 //  identify dropDown
   
   
   
   
   //get option which is selected first
    Thread.sleep(2000);
    System.out.println(sel2.getFirstSelectedOption().getText());
    
   
   
   
   
   
    
    

	
	
	}

}
