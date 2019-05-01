package collectionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListGooglePageExample {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
		int totalNoOfLinks=links.size();
		System.out.println("Total no of links = "+totalNoOfLinks);
	
		int a=0;
		for (int i = 0; i < totalNoOfLinks; i++) {
			WebElement link = links.get(i);
			String linktext=link.getText();	
			if (!linktext.equals("")) {
				System.out.println(linktext);
				a++;
				
			}
		}
		System.out.println("Total no. of links with text which are visible = "+a++);
	}
}
