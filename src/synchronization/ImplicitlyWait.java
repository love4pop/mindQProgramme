package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		WebElement ele1 = driver.findElement(By.id("identifierId"));
		ele1.sendKeys("ambikabagha@gmail.com");
		
		WebElement ele2 = driver.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		ele2.click();
		
		WebElement ele3 = driver.findElement(By.name("password"));
		ele3.sendKeys("ambikabagha");
	}

}
