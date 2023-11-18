package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		//driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		//store all the drag element
		WebElement src1 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement src2 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[1]"));
		WebElement src3 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
		WebElement src4 = driver.findElement(By.xpath("(//div[@class='drop-column min-h-[200px] bg-slate-100'])[2]"));
             
		//store all the drop element
		WebElement target1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement target4 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		 
		Actions ac = new Actions(driver);
		
		Thread.sleep(2000);
	      ac.dragAndDrop(src1, target1).perform();
	
	}

	
	}


