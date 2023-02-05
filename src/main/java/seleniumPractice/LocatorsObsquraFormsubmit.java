package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsObsquraFormsubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		driver.findElement(By.partialLinkText("Submit")).click();
driver.findElement(By.id("validationCustom01")).sendKeys("Ansha");
driver.findElement(By.id("validationCustom02")).sendKeys("V M");
driver.findElement(By.id("validationCustomUsername")).sendKeys("anshavm123");
driver.findElement(By.cssSelector("input[placeholder=\"City\"]")).sendKeys("kochi");
driver.findElement(By.xpath("//input[@placeholder='State']")).sendKeys("kerala");
driver.findElement(By.cssSelector("#validationCustom05")).sendKeys("682034");
WebElement check=driver.findElement(By.id("invalidCheck"));
boolean a=check.isSelected();
System.out.println(a);    //false
check.click();
boolean b=check.isSelected();
System.out.println(b);     //true
driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
