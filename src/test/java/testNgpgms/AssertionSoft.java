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

public class AssertionSoft {
	WebDriver driver;
  @Test
  public void validateTitle() {
	  String actualtitle=driver.getTitle();
	  SoftAssert s=new SoftAssert();
	  AssertJUnit.assertEquals(actualtitle,"Obsqura Testing");
	  System.out.println("line after first assertion");
	  String actualurl=driver.getCurrentUrl();
	  AssertJUnit.assertEquals(actualurl,"https://selenium.obsqurazone.com/simple-form-demo.php");
	  System.out.println("line after second assertion");

	  AssertJUnit.assertNotNull(driver);
	  s.assertAll();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
