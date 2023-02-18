package ActionClassExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseActions {
	WebDriver driver;
  @Test
  public void validateMouseActions() throws Exception {
	  WebElement signon=driver.findElement(By.xpath("//a[text()='SIGN-ON']"));
	  WebElement contact=driver.findElement(By.xpath("//a[text()='CONTACT']"));

	  WebElement register=driver.findElement(By.xpath("//a[text()='REGISTER']"));
	  Actions act=new Actions(driver);
act.moveToElement(signon).moveToElement(contact).moveToElement(register).click();
act.perform();
Thread.sleep(3000);
WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
act.contextClick(home);
act.perform();
Thread.sleep(3000);

WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
act.doubleClick(firstname);
act.perform();

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	 driver.get("https://demo.guru99.com/test/newtours/");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
