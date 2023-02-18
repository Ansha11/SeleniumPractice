package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ObsquraFormSubmit {
	WebDriver driver;
  @Test
  public void validateForm() {
	 WebElement firstname=driver.findElement(By.cssSelector("#validationCustom01"));
	 firstname.sendKeys("ansha");
	 System.out.println(firstname.getText());
	 WebElement lastname=driver.findElement(By.id("validationCustom02"));
	 lastname.sendKeys("v m");
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("anshavm");
	 driver.findElement(By.id("validationCustom03")).sendKeys("kochi");
	 driver.findElement(By.id("validationCustom04")).sendKeys("kerala");
	 driver.findElement(By.id("validationCustom05")).sendKeys("682034");
	 driver.findElement(By.id("invalidCheck")).click();
	 driver.findElement(By.xpath("//button[starts-with(@type,'sub')]")).click();
	 WebElement show=driver.findElement(By.xpath("//div[text()='Form has been submitted successfully!']"));
	 String actual=show.getText();
	 System.out.println(actual);
	 Assert.assertEquals(actual,"Form has been submitted successfully!");
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	   driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/form-submit.php");
  }

  @AfterTest
  public void afterTest() {
  }

}
