package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RadiobuttonObsqura {
	WebDriver driver;
  @Test
  public void validateRadiobutton() {
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@name='inlineRadioOptions']"));
	  obj.get(1).click();
	  driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
	  List<WebElement>obj1=driver.findElements(By.xpath("//input[@name='student-gender']"));
	  obj1.get(0).click();
	  List<WebElement>obj2=driver.findElements(By.xpath("//input[@name='student-age']"));
	  obj2.get(1).click();
	  driver.findElement(By.xpath("//button[text()='Get Results']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
