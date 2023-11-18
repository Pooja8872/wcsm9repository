package synchronizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSynchronize {

	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	driver.findElement(By.xpath("//span[text()='✕']")).click();
	
	driver.findElement(By.xpath("//a[@class='_1krdK5' and @title='Cart']")).click();
	driver.findElement(By.xpath("//span[text()='Login']"));
	
	
	
	}

}
