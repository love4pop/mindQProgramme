package BrowserUrlPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	driver.get("http://flipkart.com");
	driver.manage().window().maximize();
	driver.navigate().back();
	driver.navigate().forward();
}
}
