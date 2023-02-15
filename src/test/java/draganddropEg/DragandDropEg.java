package draganddropEg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragandDropEg {
	WebDriver driver;
  @Test
  public void validateDragAndDrop() {
	  WebElement source1=driver.findElement(By.xpath("//a[text()=' BANK ']"));
	  WebElement destination1=driver.findElement(By.xpath("//ol[@id='bank']"));
	  Actions act=new Actions(driver);
	  act.dragAndDrop(source1, destination1);
	  
	  WebElement source2=driver.findElement(By.xpath("//a[text()=' 5000 ']"));
	  WebElement destination2=driver.findElement(By.id("amt7"));
	  act.dragAndDrop(source2, destination2);
	  
	  WebElement source3=driver.findElement(By.xpath("//a[text()=' SALES ']"));
	  WebElement destination3=driver.findElement(By.xpath("//ol[@id='loan']"));
	  act.dragAndDrop(source3, destination3);
	  
	  WebElement source4=driver.findElement(By.xpath("//a[text()=' 5000']"));
	  WebElement destination4=driver.findElement(By.xpath("//ol[@id='amt8']"));
	  act.dragAndDrop(source4, destination4);
	  act.perform();  

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/drag_drop.html");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
