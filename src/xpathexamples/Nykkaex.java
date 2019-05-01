package xpathexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Nykkaex {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://nykaa.com");
		WebElement network=driver.findElement(By.linkText("NYKAA NETWORK"));
		network.click();
		//WebElement obj=driver.findElement(By.partialLinkText("NETWORK"));
		//network.click();
		
	}

}
