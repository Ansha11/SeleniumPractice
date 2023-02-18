package testNgpgms;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Screenshot1 {
	WebDriver driver;
  @Test
  public void screenshot() throws AWTException, Exception {
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);

  }
  @AfterMethod
  public void afterMethod(ITestResult r) throws Exception {
	  if(ITestResult.SUCCESS==r.getStatus()) {
		  System.out.println(r.getStatus());
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f,new File("/Users/Sanoob/Desktop/screenshot/"+r.getName()+".jpeg"));
	  }
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/locatorspractice/");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
