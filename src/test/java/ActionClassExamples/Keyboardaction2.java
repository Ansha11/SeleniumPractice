package ActionClassExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Keyboardaction2 {
	WebDriver driver;
  @Test
  public void validateEnterkey() throws AWTException {
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("gmail");
	  Actions act=new Actions(driver);
	act.sendKeys(Keys.ENTER);
	  act.keyUp(Keys.ENTER);
	  act.keyDown(Keys.ENTER);
	  act.perform();
	/* Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);*/
	  System.out.println(driver.getTitle());
  }
  @BeforeTest
  public void beforeTest() {System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
  driver=new ChromeDriver();
driver.get("https://www.google.com.au/");
driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
