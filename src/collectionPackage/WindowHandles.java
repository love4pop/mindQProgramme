package collectionPackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");

		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			System.out.println(id);
		}
	}

}
