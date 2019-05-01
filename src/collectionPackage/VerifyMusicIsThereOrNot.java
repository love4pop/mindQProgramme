package collectionPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyMusicIsThereOrNot {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://ebay.com");
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		Select sel = new Select(dropDown);
		List<WebElement> items = sel.getOptions();
		System.out.println("Total no of items in the dropdown are =" + items.size());
		
		int cnt = 0;
		for (int i = 0; i < items.size() && !items.get(i).getText().equals("Music"); i++) {
			cnt++;
		}
		if (cnt < items.size()) {
			System.out.println("Item Found");
		} else if (cnt == items.size()) {
			System.out.println("Item not Found");
		}

	}
}
