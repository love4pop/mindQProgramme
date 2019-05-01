package collectionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderEx2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://apsrtconline.in/oprs.web/");
		
		List<WebElement> rows = driver.findElements(By.xpath("(.//*[@class='ui-datepicker-calender'])[1]/tbody/tr"));
		
	}


}
