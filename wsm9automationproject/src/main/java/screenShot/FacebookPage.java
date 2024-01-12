package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import com.google.common.io.Files;

public class FacebookPage {

	public static void main(String[] args) throws IOException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
	 WebDriver driver= new ChromeDriver(co);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.google.co.in/");
	 driver.switchTo().activeElement().sendKeys("Facebook",Keys.ENTER);
	 driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']")).click();
	 driver.findElement(By.id("email")).sendKeys("sutarpooja997@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("20021993");
	 driver.findElement(By.name("login")).click();
		 
	 
	WebElement fb = driver.findElement(By.xpath("//div[@class='xw7yly9 xh8yej3']"));
	
         File src = fb.getScreenshotAs(OutputType.FILE);
         
         
	 
	        	File desc = new File("./Screenshot/src.png");
                    Files.copy(src, desc);
	}

}
