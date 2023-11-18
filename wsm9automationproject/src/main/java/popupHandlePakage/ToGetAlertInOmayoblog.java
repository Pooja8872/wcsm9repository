package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAlertInOmayoblog {

	public static void main(String[] args) throws InterruptedException {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://omayo.blogspot.com/");

  
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,700)");
	driver.findElement(By.id("alert1")).click();
	
	//Generate alert popup
	Alert al = driver.switchTo().alert();	
	
	//Accept alert popup
	Thread.sleep(2000);
	//al.accept();
	
	//Dismiss alert popup
	Thread.sleep(2000);
	//al.dismiss();
	
	//Get text of alert popup
	String textOfalert = al.getText();
	System.out.println(textOfalert);
	al.accept();
	}
	

}
