package popupHandlePakage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {

		WebDriver	driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("");
	}

}
