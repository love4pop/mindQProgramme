package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusExample {
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in");
     
     //WebElement fromtextbox = driver.findElement(By.xpath("//input[@class=\"db\"]"));
	          // fromtextbox.sendKeys("Marathahalli,Bangalore");
	
   //WebElement totextbox = driver.findElement(By.xpath(".//input[@class=\"db\"])[2]"));
	          // totextbox.sendKeys("Hyderabad");
        
		           
	
	}

}
