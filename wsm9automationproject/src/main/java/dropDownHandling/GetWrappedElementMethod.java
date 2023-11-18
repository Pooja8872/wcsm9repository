package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWrappedElementMethod {

	public static void main(String[] args) {
		
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/ADMIN/Desktop/wcsm%20webelement/dropdownMultiple.html");
		//single select dropDown
	WebElement dropdown1 = driver.findElement(By.xpath("//option[text()='Poha']"));
	 select sel = new select(dropdown1);
	 sel
		//handle dropDown
	}
	
		//get all the option from dropDown by using GetWrappedElementMethod
	WebElement allops=sel.GetWrappedElement();
	System.out.println(allops.getText());
	//	//get all the option from dropDown by using getOptions
	List<WebElement>options=sel.getOptions();
	
	
	//select the option from dropdown without using selection method
	for(WebElement opt:options)
	
	{
		Thread.sleep(2000);
		if(opt.getText().equals("vadapav"))
	{
			opt.click();
			break;
	}
	}

}
