package readExelDataNew;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTeatCase {

	public static void main(String[] args) {
     
	WebDriver 	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://desktop-kbqtn52:8080/login.do");
	
	Flib flib = new Flib();
	int rc = flib.rowCount("./src/main/resource/ActiTimeTestCase.xlsx","Invalidcreds");
	
	for(int i=1;i<=rc;i++) {
		String usnData = flib.readExcelData("./src/main/resource/ActiTimeTestCase.xlsx","Invalidcreds",i,0);
		String pwdData = flib.readExcelData("./src/main/resource/ActiTimeTestCase.xlsx","Invalidcreds",i,1);
	   
		driver.findElement(By.name("username")).sendKeys(usnData);
		driver.findElement(By.name("pwd")).sendKeys(pwdData);
		
	}
	
	
	

	}

}
