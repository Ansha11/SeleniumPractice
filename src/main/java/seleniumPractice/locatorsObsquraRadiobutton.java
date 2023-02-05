package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsObsquraRadiobutton {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
driver.findElement(By.cssSelector("#inlineRadio2")).click();
//driver.findElement(By.id("button-one")).click();
driver.findElement(By.xpath("//button[text()='Show Selected Value']")).click();
driver.findElement(By.id("inlineRadio11")).click();
driver.findElement(By.id("inlineRadio24")).click();
driver.findElement(By.id("button-two")).click();
	}

}
