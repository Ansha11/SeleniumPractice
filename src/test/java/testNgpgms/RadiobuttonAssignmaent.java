package testNgpgms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RadiobuttonAssignmaent {
	WebDriver driver;
  @Test
  public void radiobutton() {
	  boolean b=false;
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@name='name']"));

int l=obj.size();
	for(int i=0;i<l;i++)  {
	 b=obj.get(i).isSelected();
	 System.out.println(b);
	}
	 System.out.println("value= "+b);

AssertJUnit.assertFalse(b);
obj.get(1).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/ajax.html");
  }
 @AfterClass
  public void afterClass() {
	//  driver.close();
  }

}
