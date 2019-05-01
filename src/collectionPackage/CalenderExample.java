package collectionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExample {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://redbus.in");

		driver.findElement(By.xpath(".//*[text()='Onward Date']")).click();
		WebElement ele = driver.findElement(By.xpath("(.//*[@class='monthTitle'])[2]"));
		String yr = ele.getText();
		System.out.println(yr);

	}
}
