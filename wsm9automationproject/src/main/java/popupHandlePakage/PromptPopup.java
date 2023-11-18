package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		
		driver.findElement(By.partialLinkText("Prompt")).click();
		
		//generate prompt popup 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		
		//handle prompt  Popup
		Alert al = driver.switchTo().alert();
		
		//send to yes
		Thread.sleep(2000);
		al.sendKeys("yes");
		
		
		



	}

}
