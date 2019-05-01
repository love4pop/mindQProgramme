package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		driver.get("http://gmail.com");
		
		WebElement ele1 = driver.findElement(By.id("identifierId"));
		ele1.sendKeys("ambikabagha@gmail.com");
		
		WebElement ele2 = driver.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		ele2.click();
				
		try {
			WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
			ele3.sendKeys("ambikabagha");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
