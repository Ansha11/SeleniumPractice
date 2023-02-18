

package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionsHardEg1 {
	WebDriver driver;
  @Test
  public void verifyTitle()  {
	  String actualtitle=driver.getTitle();
	  System.out.println(actualtitle);
AssertJUnit.assertEquals(actualtitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	  AssertJUnit.assertNotNull(driver);  
  }
  @Test
  public void displayGroceryButton()  {
	 boolean a= driver.findElement(By.xpath("//div[text()='Grocery']")).isDisplayed();
	 Assert.assertFalse(a,"not match");
  }
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
   driver=new ChromeDriver();
  driver.get("https://www.flipkart.com");
  }

  @AfterTest
  public void afterTest() {
	 driver.close();
  }

}
