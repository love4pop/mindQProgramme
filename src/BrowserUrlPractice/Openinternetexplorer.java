package BrowserUrlPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openinternetexplorer {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("http://ebay.com");
		//String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		driver.get("http://google.com");
		String actualTitle=driver.getTitle();
		//System.out.println(actualTitle);
		//String actualTitle="google";
		String expectedTitle="google";
		if(actualTitle.equals(expectedTitle)); {
		System.out.println("pass");
		}
	}
}	
	
