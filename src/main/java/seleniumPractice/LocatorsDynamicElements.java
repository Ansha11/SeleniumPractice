package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDynamicElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");

WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field' or  class='form-control' ]"));
message.sendKeys("hello");



WebElement valueA=driver.findElement(By.xpath("//input[@id='value-a' and @placeholder=\"Enter Value\"]"));
valueA.sendKeys("10");

/*
//WebElement msg1=driver.findElement(By.xpath("//input[contains(@id,'input')]"));
//msg1.sendKeys("hi");
WebElement msg2=driver.findElement(By.xpath("//input[starts-with(@id,'single')]"));
msg2.sendKeys("hi");*/
	}

}
