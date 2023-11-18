package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class OmayoblogDisableTextbox {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,700)");
		
		
	
		
		js.executeScript("document.getElementById('tb2').value='Automation Testing'");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("Screenshot/src.png");
		Files.copy(src, desc);
	
		
	}

}
