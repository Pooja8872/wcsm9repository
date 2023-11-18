package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		//generate alert popup
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();

		//handle alert popup
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		//accept alert popup
		//Thread.sleep(2000);
         //al.accept();
	
         //dismiss alert popup
        // Thread.sleep(2000);
         //al.dismiss();
		
		//get text of alert popup
		String textOfalert = al.getText();
		System.out.println(textOfalert);
		 al.accept();
		
		
		
		
		
		
	
	}

}
