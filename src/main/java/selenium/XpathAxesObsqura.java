package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesObsqura {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		
		driver.findElement(By.xpath("//select[@id='single-input-field']//child::option[3]")).click();
		driver.findElement(By.xpath("//select[@id='multi-select-field']//child::option[3]")).click();
		driver.findElement(By.xpath("//button[@id='button-all']")).click();
	}

}
