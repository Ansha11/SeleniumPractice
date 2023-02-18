package draganddropEg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DraganddropAssignment {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
WebElement support=driver.findElement(By.xpath("//a[text()='Support'][1]"));
	  
	  WebElement learningcntr=driver.findElement(By.xpath("//a[text()='Learning Center'][1]"));
	  Actions act=new Actions(driver);

	  act.moveToElement(support);
act.click(learningcntr);
System.out.println(driver.getTitle());
act.perform();
Thread.sleep(5000);

driver.navigate().to("http://jqueryui.com/droppable/");
System.out.println(driver.getTitle());
driver.switchTo().frame(0);                //switch into iframe
WebElement source=driver.findElement(By.cssSelector("div[id='draggable']"));
WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
act.dragAndDrop(source, destination);
act.perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	 driver=new ChromeDriver();
	 driver.get("http://jqueryui.com/droppable/");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
