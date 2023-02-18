package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertExample {
	WebDriver driver;
  @Test
  public void alertvalidation() throws InterruptedException {
	WebElement customerid= driver.findElement(By.xpath("//input[@name='cusid']"));
	  customerid.sendKeys("1234");
	  Thread.sleep(3000);
	  
	  WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	  submit.click();
	  Alert alert=driver.switchTo().alert();
	  alert.dismiss();
	  
	  WebElement reset=driver.findElement(By.xpath("//input[@name='res']"));
	  reset.click();
	  
	  customerid.sendKeys("4567");
	  Thread.sleep(3000);
	  submit.click();
	  Thread.sleep(3000);
	  alert.accept();
	  String s=alert.getText();
	  System.out.println(s);
	  alert.accept();
  }
  @BeforeTest
  public void beforeTest() {System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
  driver=new ChromeDriver();
 driver.get("https://demo.guru99.com/test/delete_customer.php");
  }
  @AfterTest
  public void afterTest() {
  }
}
