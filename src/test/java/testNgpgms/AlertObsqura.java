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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class AlertObsqura {
	WebDriver driver;
  @Test(priority=1)
  public void validateSimpleAlert() throws Exception  {
	 
	  WebElement clickbutton1=driver.findElement(By.cssSelector("button[class='btn btn-success']"));
	  clickbutton1.click();
	  Thread.sleep(3000);
	  Alert alert1=driver.switchTo().alert();
	  alert1.accept();
  }
  @Test(priority=2)
  public void validateConfirmationAlert() throws Exception  {
WebElement clickbutton2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
clickbutton2.click();
Thread.sleep(3000);
Alert alert2=driver.switchTo().alert();
alert2.dismiss();

}
  @Test(priority=3)
  public void validateConfirmationAlertText()  {
	  WebElement msg=driver.findElement(By.id("confirm-demo"));
	  String actual=msg.getText();
	  String expected="You pressed Cancel!";
	  System.out.println(actual);
	  AssertJUnit.assertEquals(actual,expected);
  }
  
  @Test(priority=4)
  public void validatePromptAlert() throws Exception {
	  WebElement clickbutton3=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	  clickbutton3.click();
	  Thread.sleep(3000);
	  Alert alert3=driver.switchTo().alert();
	  alert3.sendKeys("Ansha");
	  alert3.accept();
  }
  @Test(priority=5)
  public void validatePromptAlertText() {
	  WebElement showmsg=driver.findElement(By.id("prompt-demo"));
	  String actual=showmsg.getText();
	  String expected="You have entered 'Ansha' !";
	  System.out.println(actual);
	  SoftAssert S=new SoftAssert();
S.assertNotEquals(actual, expected);	    
	   }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
   driver=new ChromeDriver();
  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
}






