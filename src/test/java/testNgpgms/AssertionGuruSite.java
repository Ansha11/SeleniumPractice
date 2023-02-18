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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AssertionGuruSite {
	WebDriver driver;
  @Test(priority=1)
  public void validateLogin() {
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("submit")).click();
	  
  }
  @Test(priority=2)
  public void validateLoginSuceessfully() {
	 WebElement success= driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	 System.out.println(success.getText());
	 boolean a=success.isDisplayed();
	 System.out.println(a);
	 AssertJUnit.assertTrue(a);
	 AssertJUnit.assertNotNull(driver);
  }
  @Test(priority=3)
  public void displayRegister() {
	  WebElement register=driver.findElement(By.linkText("REGISTER"));
	  boolean b=register.isDisplayed();
		 System.out.println(register.getText());

		 SoftAssert s=new SoftAssert();
		 AssertJUnit.assertTrue(b);
		 System.out.println(b);

		 s.assertAll();

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours");
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}





