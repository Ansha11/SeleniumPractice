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

public class AssertionsHard1 {
	WebDriver driver;
  @Test
  public void validateTitle() {
	   
	  String actualtitle=driver.getTitle();
	  AssertJUnit.assertEquals(actualtitle,"Obsqura Testing"); 
	  
  }
  @Test
  public void validateUrl() {
	   
	  String actualurl=driver.getCurrentUrl();
	  AssertJUnit.assertEquals(actualurl,"https://selenium.obsqurazone.com/simple-form-demo.php");
	  
  } @Test
  public void displayMessage() {
	  driver.findElement(By.id("single-input-field")).sendKeys("hello");
	  driver.findElement(By.xpath("//button[text()='Show Message']")).click();
	  WebElement show=driver.findElement(By.id("message-one"));
	  System.out.println(show.isDisplayed());
	  boolean a=show.isDisplayed();
	  System.out.println(show.getText());
	  AssertJUnit.assertEquals(a,true);
  }
  @Test
  public void displaySimpleFormDemo() {
	WebElement form=  driver.findElement(By.linkText("Simple Form Demo"));
	  boolean b=form.isDisplayed();
	  AssertJUnit.assertEquals(b,true);
  }
  @Test
  public void verifyLogo() {
	  boolean c=driver.findElement(By.xpath("//div[@class='top-logo']//child::img")).isDisplayed();
 AssertJUnit.assertEquals(c,true);
  }
  @Test
  public void checkboxDemo() {
	  boolean d=driver.findElement(By.linkText("Checkbox Demo")).isDisplayed();
	  AssertJUnit.assertTrue(d);
  }
  @Test
  public void checkingvaluea() {
	 WebElement valuea= driver.findElement(By.id("value-a"));
	 boolean e=valuea.isDisplayed();
	 
	 System.out.println("value  ="+e);
	 System.out.println(valuea.getText());
	 AssertJUnit.assertTrue(e);
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
	 // driver.close();
  }

}
