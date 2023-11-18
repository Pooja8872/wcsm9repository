package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
        driver.findElement(By.xpath("//section[text()='Popups']")).click();
        driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
        WebElement targetElement = driver.findElement(By.name("file"));
        
        //By using Double Click  method of Action class
         Actions act = new Actions(driver);
         act.doubleClick(targetElement ).perform();
         Thread.sleep(2000);
         
         file file = new file("./autoITPgm/FileUpload.exe");
         
         
	}

}

