package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FileDownloadObsqura {
	WebDriver driver;
  @Test
  public void fileDownload() {
	  driver.findElement(By.id("textbox")).sendKeys("Test");
	  driver.findElement(By.id("create")).click();
	  driver.findElement(By.id("download-file")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/file-download.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
