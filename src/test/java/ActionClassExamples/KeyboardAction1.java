package ActionClassExamples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class KeyboardAction1 {
	WebDriver driver;
  @Test
  public void KeyboardActions() throws Exception {
	  
	 Actions act=new Actions(driver);
act.sendKeys(Keys.ENTER).perform();	;
//act.keyUp(Keys.ENTER);                         // both methods perform same fn
//act.keyDown(Keys.ENTER);

Thread.sleep(3000);

act.sendKeys(Keys.ARROW_UP).perform();;
Thread.sleep(3000);

act.sendKeys(Keys.BACK_SPACE).perform();;
Thread.sleep(3000);

act.sendKeys(Keys.TAB).perform();
Thread.sleep(3000);


	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("http://the-internet.herokuapp.com/key_presses");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
