package testNgpgms;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ScreenshotEg {
	WebDriver driver;
  @Test
  public void validateScreenshot() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("123");
	  driver.findElement(By.name("submit")).click();
  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws Exception {
	  if(ITestResult.SUCCESS==r.getStatus()) {
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("/Users/Sanoob/Desktop/screenshot/"+r.getName()+"jpeg"));
  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
		  driver.get("http://demo.guru99.com/test/newtours/index.php");
driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
