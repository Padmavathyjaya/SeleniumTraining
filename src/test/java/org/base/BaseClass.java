package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchurl(String url) {
		driver.get(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void passText(String text, WebElement element) {
		element.sendKeys(text);
	}

	public static void closeEntireBrower() {
		driver.quit();
	}

	public static void clickBtn(WebElement element) {
		element.click();
	}

	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ img.png");
		FileUtils.copyFile(img, f);

	}

	public static Actions a;

	public static void moveCurse(WebElement targetelement) {
		a = new Actions(driver);
		a.moveToElement(targetelement).perform();
	}

	public static void dragDrop(WebElement dragelement, WebElement dropelement) {
		a = new Actions(driver);
		a.dragAndDrop(dragelement, dropelement);
	}

	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);

	}

	public static void excelSheet(String sheetname, int rownum, int cellnum) throws IOException {
		File f = new File("excellocation.xlsc");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Data");
		Row r = sheet.getRow(rownum);
		Cell c = r.getCell(cellnum);
		int cellType = c.getCellType();

		String value = "  ";
		if (cellType == 1) {
			String value1 = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String value2 = s.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
		}
	}

	public static void createExcelSheet(int rownum, int cellnum, String newdata) throws IOException {
		File f = new File("E:\\MavenSample\\Excel\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet newsheet = wb.createSheet("Data");
		Row newrow = newsheet.createRow(rownum);
		Cell newcell = newrow.createCell(cellnum);
		newcell.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void createCell(int rownum, int cellnum, String newdata) throws IOException {
		File f = new File("E:\\MavenSample\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet newsheet = wb.getSheet("Data");
		Row newrow = newsheet.getRow(rownum);
		Cell newcell = newrow.createCell(cellnum);
		newcell.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createrow(int rownum, int cellnum, String newdata) throws IOException {
		File f = new File("E:\\MavenSample\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet newsheet = wb.getSheet("Data");
		Row newrow = newsheet.createRow(rownum);
		Cell newcell = newrow.createCell(cellnum);
		newcell.setCellValue(newdata);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void UpdateCell(int gettherow, int getthecell, String existingdata, String newdata)
			throws IOException {
		File f = new File("E:\\MavenSample\\Excel\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Data");
		Row row = sheet.getRow(gettherow);
		Cell cell = row.getCell(getthecell);
		String stv = cell.getStringCellValue();
		if (stv.equals(existingdata)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}
