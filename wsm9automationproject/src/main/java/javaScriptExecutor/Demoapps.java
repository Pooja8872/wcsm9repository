package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoapps {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapps.qspiders.com/");
driver.findElement(By.xpath("//section[text()='Popups']")).click();
driver.findElement(By.xpath("//section[text()='Javascript']")).click();

}

}
