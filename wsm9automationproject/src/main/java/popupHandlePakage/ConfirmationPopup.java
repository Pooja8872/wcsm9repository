package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Confirm")).click();
		
		//generate confirmation popup
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		
		//handle confirm popup
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		
		//accept cnfirm popup
		Thread.sleep(2000);
		//al.accept();
		
		//dismiss confirm popup
		Thread.sleep(2000);
		//al.dismiss();
		
		//text box confirm popup
		String textOfalert = al.getText();		
		System.out.println(textOfalert);
		
		
		
		

	}

}
