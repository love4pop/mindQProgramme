package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {
	
		public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
	     driver.get("https://www.ebay.com");
		WebElement srchtextbox = driver.findElement(By.id("gh-ac"));
		srchtextbox.sendKeys("ring");
		WebElement srchbutton = driver.findElement(By.id("gh-btn"));
		srchbutton.click();

	}

}