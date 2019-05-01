package collectionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample3 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://redbus.in");
		
		driver.findElement(By.xpath(".//*[text()='Onward Date']")).click();
		
		while (true) {
			
		}
		
	}

}
