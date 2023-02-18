package testNgpgms;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionsHard {
	WebDriver driver;
  @Test(groups= {"smoke"})
  public void validatingTitle() {
	  
	String actualtitle=driver.getTitle();
	String actualurl=driver.getCurrentUrl();
AssertJUnit.assertEquals(actualtitle,"Obsqura Testing");
	  AssertJUnit.assertEquals(actualurl,"https://selenium.obsqurazone.com/simple-form-demo.php");
	  AssertJUnit.assertNotNull(driver);
  }
  
  @BeforeTest(groups= {"smoke"})
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
