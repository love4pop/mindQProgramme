package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sonylivexample {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		
		WebElement shows = driver.findElement(By.xpath(".//span[@class=\"menu-text ng-binding\"][1]"));
		shows.click();
	}
	
	
	

}
