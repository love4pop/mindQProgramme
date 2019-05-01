package collectionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxExample {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropDown=driver.findElement(By.id("gh-cat"));
		Select sel=new Select(dropDown);
		sel.selectByIndex(4);
		sel.selectByVisibleText("Travel");
		sel.selectByValue("625");
		sel.selectByIndex(0);
	   
          WebElement defaultItems=sel.getFirstSelectedOption();
          String str= defaultItems.getText();
          if (str.equals("All Categories")) {
           System.out.println("Default value test case ="+"pass");
		   }	
        else {
		  System.out.println("Default value test case ="+"fail");
		}
	}

}
