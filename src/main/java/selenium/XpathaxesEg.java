package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathaxesEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.findElement(By.xpath("//select[@name='passCount']//child::option[2]")).click();
		driver.findElement(By.xpath("//select[@name='fromPort']//child::option[4]")).click();
		driver.findElement(By.xpath("//select[@name='fromMonth']//child::option[1]")).click();
		driver.findElement(By.xpath("//select[@name='fromDay']//child::option[9]")).click();
		driver.findElement(By.xpath("//select[@name='toPort']//child::option[9]")).click();
		driver.findElement(By.xpath("//select[@name='toMonth']//child::option[5]")).click();
		driver.findElement(By.xpath("//select[@name='toDay']//child::option[2]")).click();
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		driver.findElement(By.xpath("//select[@name='airline']//child::option[2]")).click();
		driver.findElement(By.name("findFlights")).click();
		
	}

}


