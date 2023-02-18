package draganddropEg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragandDropObsqura {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement source1=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
	  WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));

	  Actions act=new Actions(driver);
	  act.dragAndDrop(source1, destination);
	  act.perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver(); 
	  driver.get("https://selenium.obsqurazone.com/drag-drop.php");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
