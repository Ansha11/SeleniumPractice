
package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AssertionSoftEg1 {
	WebDriver driver;
	@Test
  public void validateTitle() {
		String actualtitle=driver.getTitle();
		String actualurl=driver.getCurrentUrl();
		SoftAssert s=new SoftAssert();	
	AssertJUnit.assertEquals(actualtitle,"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
 System.out.println("line below assertion1");
 AssertJUnit.assertEquals(actualurl,"https://www.flipkart.com/");
 System.out.println("line below assertion2");
	AssertJUnit.assertNotNull(driver);
 s.assertAll();
	}
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
   driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  driver.manage().window().maximize();
  }
 @AfterTest
  public void afterTest() {driver.close();
  }
}
