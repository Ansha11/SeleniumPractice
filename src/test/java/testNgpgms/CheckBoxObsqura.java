package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CheckBoxObsqura {
WebDriver driver;
  @Test(groups= {"smoke"})
  public void checkbox() {
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@type='checkbox']"));
	  obj.get(0).click();
	  List<WebElement>obj1=driver.findElements(By.xpath("//input[@class='check-box-list']"));
	  obj1.get(2).click();
	  boolean a=obj1.get(2).isSelected();
	  System.out.println(obj1.get(2).isEnabled());
	  AssertJUnit.assertEquals(a,true);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
