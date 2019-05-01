package excelReading;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Excel {
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook exfile = new XSSFWorkbook("D:\\ Ambi\\AmbiExcel.xlsx");
		XSSFSheet sheet = exfile.getSheet("data");
		int rowcount = sheet.getPhysicalNumberOfRows();
		for (int i = 1; i < rowcount; i++) {
			String un = sheet.getRow(i).getCell(1).getStringCellValue();
			String pw = sheet.getRow(i).getCell(2).getStringCellValue();

			WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 15);
				driver.get("http://gmail.com");
		
		WebElement ele1 = driver.findElement(By.id("identifierId"));
		ele1.sendKeys(un);
		
		WebElement ele2 = driver.findElement(By.xpath(".//*[@class='RveJvd snByac']"));
		ele2.click();
						
		WebElement ele3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		ele3.sendKeys(pw);
			
				driver.quit();
		}
	}
}	


		
		
	


