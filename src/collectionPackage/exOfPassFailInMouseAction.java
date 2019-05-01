package collectionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exOfPassFailInMouseAction {
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ebay.com");
		
		WebElement myebay = driver.findElement(By.linkText("My eBay"));
		Actions act = new Actions(driver);
	act.moveToElement(myebay).perform();
	
	Thread.sleep(2000);
	
	WebElement selling = driver.findElement(By.linkText("Selling"));
	selling.click();
	
	
	}

}
