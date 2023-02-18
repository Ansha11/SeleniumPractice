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

public class AssertionAssignmentExcel {
	WebDriver driver;
	FileInputStream i;
	File f;
	XSSFWorkbook w;
	XSSFSheet s;
  @Test
public void validateTitle() throws IOException {
	  String actualtitle=driver.getTitle();
	  f=new File("/Users/Sanoob/Documents/Excel.xlsx");
	  i=new FileInputStream(f);
	  w=new XSSFWorkbook(i);
	  s=w.getSheet("Sheet1");
	  Row r=s.getRow(0);
	  org.apache.poi.ss.usermodel.Cell c=r.getCell(0);
	 String expectedtitle=c.getStringCellValue();
	 AssertJUnit.assertEquals(actualtitle, expectedtitle);
		
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
  }

}
