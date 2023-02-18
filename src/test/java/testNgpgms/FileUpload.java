package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileUpload {
	WebDriver driver;
  @Test
  public void fileUpload() {
	  WebElement fileupload=driver.findElement(By.id("uploadPicture"));
	  fileupload.sendKeys("/Users/Sanoob/Desktop/Selenium Pgms-1.docx");
		 // fileupload.sendKeys("/Users/Sanoob/Desktop/Program");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
  }

}
