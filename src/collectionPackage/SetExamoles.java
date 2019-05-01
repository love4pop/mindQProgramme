package collectionPackage;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SetExamoles {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tourmyindia.com");
		
		WebElement packages = driver.findElement(By.linkText("Packages"));
			Actions act = new Actions(driver);
		act.moveToElement(packages).perform();
		
		WebElement rajasthan = driver.findElement(By.linkText("Rajasthan"));
		rajasthan.click();
		
		
	}
	
	

}
