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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DropdownObsqura {
	WebDriver driver;
  @Test
  public void dropdownSelection1() {
	  
	  WebElement color1=driver.findElement(By.xpath("//select[@id='single-input-field']"));;
	  Select s=new Select(color1);
	  s.selectByIndex(1);
	  
	  List<WebElement>alldata=s.getOptions();
	  int l=alldata.size();
	  System.out.println("size= "+l);

	  for(int i=0;i<l;i++) {
		  String text=alldata.get(i).getText();
		  System.out.println(text);
	  }
  }
  @Test
  public void validateTextDisplay() {
	  WebElement show=driver.findElement(By.xpath("//div[@id='message-one']"));
String actual=show.getText();
String expected="Selected Color : Red";
AssertJUnit.assertEquals(actual, expected) ;
}
  @Test
  public void dropdownSelection2() {
	  WebElement color2=driver.findElement(By.xpath("//select[@id='multi-select-field']"));
  Select s1=new Select(color2);
  s1.selectByValue("Green");
  }
  @Test
  public void validateGetSelectedbutton() {
	 WebElement get=driver.findElement(By.id("button-all"));
	 get.click();
	 WebElement display=driver.findElement(By.xpath("//div[@id='message-two']"));
	 System.out.println(display.getText());
	 String actual=display.getText();
	 String expected="All selected colors are : Green";
	 AssertJUnit.assertEquals(actual, expected);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/select-input.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
