package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssertionSoftExcel {
	WebDriver driver;
	XSSFSheet sheet;
	XSSFWorkbook workbook;
	File newfile;
	FileInputStream file;
	Row row;
	Cell cell;
	
  @Test
  public void validateTitle() throws IOException {
	  newfile=new File("/Users/Sanoob/Documents/Excel.xlsx");
	  file=new FileInputStream(newfile);
	  workbook=new XSSFWorkbook(file);
	  sheet=workbook.getSheet("Sheet1");
	  row=sheet.getRow(0);
	  cell=row.getCell(0);
	  String expected=cell.getStringCellValue();
	  String actual=driver.getTitle();
	  SoftAssert s=new SoftAssert();
	  AssertJUnit.assertEquals(actual, expected);
	  AssertJUnit.assertNotNull(driver);
	  s.assertAll();
	  
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
