package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/reg/");
	
	WebElement day = driver.findElement(By.id("day"));
	Select sel = new Select(day);
	sel.selectByVisibleText("6");
	Thread.sleep(2000);
	
			
	WebElement month = driver.findElement(By.id("month"));
	Select sel1 = new Select(month);
	sel1.selectByValue("10");
	Thread.sleep(2000);
	
	WebElement year = driver.findElement(By.id("year"));
	Select sel2 = new Select(year);
	sel2.selectByVisibleText("2020");
	Thread.sleep(2000);
	
	
	
	
	
	

	}

}
