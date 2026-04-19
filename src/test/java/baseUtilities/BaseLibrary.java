package baseUtilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import applicationUtilities.JSExecutor;
import excelUtilities.ExcelUtility;

public class BaseLibrary implements ExcelUtility, JSExecutor {

	public static WebDriver driver = null;

	public void launchUrl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

	@Override
	public String getReadData(String path, int sheetNo, int rowNo, int colNo) {
		String value = null;
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetNo);

			DataFormatter formatter = new DataFormatter();
			value = formatter.formatCellValue(sheet.getRow(rowNo).getCell(colNo));

			wb.close();

		} catch (Exception e) {
			System.out.println("Fine not found");
		}

		return value;
	}

	@Override
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].scrollIntoView()", element);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
