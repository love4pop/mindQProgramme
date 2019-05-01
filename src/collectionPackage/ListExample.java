package collectionPackage;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListExample {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://nykaa.com");
	
	java.util.List<WebElement> identifyAllLinks=driver.findElements(By.tagName("a"));
	int totalNoOfLinks=identifyAllLinks.size();
	System.out.println("Total no of links = "+totalNoOfLinks);
	
	for (int i = 0; i < totalNoOfLinks; i++) {
		WebElement printTheLinks = identifyAllLinks.get(i);
		
		String allLinksText=printTheLinks.getText();
		System.out.println(allLinksText);
	}
	
	
	}
	

}
