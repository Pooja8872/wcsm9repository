package actionPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAssignment {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://jqueryui.com/droppable/");
//	driver.switchTo().frame(0);//by using int index
	Thread.sleep(2000);
	
	WebElement FrameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(FrameElement);//by using webElement frame
	Thread.sleep(2000);
	
	//drag the Element
   WebElement target = driver.findElement(By.id("droppable"));
   
  // drop the element
  WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
  
   Actions act = new Actions(driver);
   act.dragAndDrop(src, target).perform();
  
	}

}
