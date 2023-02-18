package DemoPgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Amazon {
	WebDriver driver;
  @Test
  public void clickingSignin() {
	  WebElement account=driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	  account.click();
	  
  }
  @Test(enabled=false)
  public void incorrectLogin() {
	  WebElement phone=driver.findElement(By.id("ap_email"));
	  phone.sendKeys("9476588947");
	  WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
	  cont.click();
	  }
  @Test(enabled=false)
  public void incorrectLoginDetails() {
	  WebElement incorrect=driver.findElement(By.xpath("//h4[text()='Incorrect phone number']"));
	  String s=incorrect.getText();
	  System.out.println(s);
	  boolean result=incorrect.isDisplayed();
	  System.out.println("Incorrect phone no. msg displayed : "+result);

	  Assert.assertEquals(s,"Incorrect phone number");
	  Assert.assertTrue(result);
  }
  @Test
  public void validateLogin() {
	  WebElement phone=driver.findElement(By.id("ap_email"));
	  phone.clear();
	  phone.sendKeys("9497883663");
	  WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
	  cont.click();

	  WebElement password=driver.findElement(By.xpath("//input[@id='ap_password']"));
	  password.sendKeys("Anshavm@123");
	  WebElement checkbox=driver.findElement(By.xpath("//input[@name='rememberMe']"));
	  checkbox.click();
	  boolean a=checkbox.isSelected();
	  System.out.println("checkbox selected :"+a);
	  Assert.assertTrue(a);
	  WebElement signin=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
	  signin.click();
	  
  }
  @Test(enabled=false)
  public void verifyLoginMessage() {
	  
	  WebElement msg=driver.findElement(By.xpath("//span[text()='Hello, Ansha']"));
	  System.out.println(msg.getText());
	  boolean b=msg.isDisplayed();
	  Assert.assertTrue(b);
	  
  }
  @Test(enabled=false)
  public void verifyMouseHover() {
	  WebElement prime=driver.findElement(By.xpath("//span[text()='Prime']"));
	  WebElement kindlebooks=driver.findElement(By.xpath("//a[text()='Kindle Books']"));
	  WebElement giftcards=driver.findElement(By.xpath("//a[text()='Gift Cards']"));

	  Actions act=new Actions(driver);
	  act.moveToElement(prime).moveToElement(kindlebooks).moveToElement(giftcards).click();
	  act.build().perform();


  }
  @Test
  public void purchaseItem() {

WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
search.sendKeys("electronics");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.com.au/");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest() {
  }

}
