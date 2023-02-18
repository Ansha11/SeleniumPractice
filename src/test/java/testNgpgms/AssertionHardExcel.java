package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionHardExcel {
	WebDriver driver;
	XSSFSheet sheet;
	File newfile;
	FileInputStream file;
	XSSFWorkbook workbook;
	Row row;
	org.apache.poi.ss.usermodel.Cell cell;
  @Test
  public void validateTitle() throws IOException {
	  newfile=new File("/Users/Sanoob/Documents/Excel.xlsx");
        file=new FileInputStream(newfile);	 
        workbook=new XSSFWorkbook(file);
        sheet=workbook.getSheet("Sheet1");
        row=sheet.getRow(0);
        cell=row.getCell(0);
	  String actual=driver.getTitle();
	  String expected=cell.getStringCellValue();
	  AssertJUnit.assertEquals(actual, expected);
	  AssertJUnit.assertNotNull(driver);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
