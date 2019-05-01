package collectionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllTheItemsDropdown {
	
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://ebay.com");
	WebElement dropDown=driver.findElement(By.id("gh-cat"));
	Select sel=new Select(dropDown);
	List<WebElement> allItemsFromDropdownBox = sel.getOptions();
	System.out.println("Total no.of items in the dropdown are ="+allItemsFromDropdownBox.size());
	
	for (int i = 0; i <allItemsFromDropdownBox.size(); i++) {
	String dropdownItemText	= allItemsFromDropdownBox.get(i).getText();
		System.out.println(dropdownItemText);
	}
	
	
	
  }

}
