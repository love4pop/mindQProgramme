package buttonAndbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import xpathexamples.Webelement;

public class SelectBothCheckboxAtOneTime {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		List<WebElement> checkboxes= driver.findElements(By.xpath(".//*[@type='checkbox']"));
		    for (WebElement checkbox : checkboxes) {
			     boolean state = checkbox.isSelected();
			     if (state==false) {
				    checkbox.click();
				
			}
		}
	}

}
