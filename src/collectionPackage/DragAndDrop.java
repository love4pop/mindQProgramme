package collectionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		WebElement element1 = driver.findElement(By.id("gh-btn"));
		WebElement element2 = driver.findElement(By.id("gf-norton"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(element1, element2).perform();
		
	}

}
