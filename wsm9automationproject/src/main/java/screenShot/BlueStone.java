package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStone {

	public static void main(String[] args) throws IOException {
    WebDriver  driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https://www.bluestone.com/");
    driver.findElement(By.id("denyBtn")).click();
   WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins ']"));
   
  Actions act = new Actions(driver);
  act.moveToElement(coinsTarget).perform();
  
  driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
  WebElement coins = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
              File src = coins.getScreenshotAs(OutputType.FILE);
             File desc = new File("./Screenshot/src.png");
            Files.copy(src,desc);
               
    
	}

}
