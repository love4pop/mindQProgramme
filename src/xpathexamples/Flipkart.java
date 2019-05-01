package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
     //driver.get("https://www.flipkart.com/search?q=laptops&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
   //WebElement secodlaptop = driver.findElement(By.xpath(".//*[@class='_3wU53n'])[1]"));
    		    		//secodlaptop.click();
		driver.get("http://gmail.com");
		WebElement srchtxtbox = driver.findElement(By.xpath(""));
		
		srchtxtbox.sendKeys("ring");
     
	}
}
