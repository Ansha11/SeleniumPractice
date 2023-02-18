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
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SpacejetDropdown {
	WebDriver driver;
  @Test
  public void validateRadiobutton() {
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']"));
	  obj.get(1).click();	  
  }
  @Test
  public void validatedropdown() {
  WebElement depart=driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']"));
  Select s1=new Select(depart);
  s1.selectByValue("BLR");
  WebElement arrival=driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_destinationStation1']"));
  Select s2=new Select(arrival);
  s2.selectByIndex(4);
  
  }
  
  
  
  @BeforeTest
  public void beforeTest() {System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
  driver=new ChromeDriver();
 driver.get("https://corporate.spicejet.com/default.aspx");
  }

  @AfterTest
  public void afterTest() {
  }

}
