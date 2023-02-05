package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsObsquraCheckbox {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

driver.findElement(By.linkText("Checkbox Demo")).click();

driver.findElement(By.id("gridCheck")).click();

driver.findElement(By.id("check-box-four")).click();

driver.findElement(By.cssSelector("input[value=\'Select All\']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[value=\'Select All\']")).click();




	}

}
