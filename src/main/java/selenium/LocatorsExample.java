package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://rahulshettyacademy.com/locatorspractice");
driver.manage().window().maximize();



WebElement username=driver.findElement(By.id("inputUsername"));
username.sendKeys("rahul");

WebElement password=driver.findElement(By.name("inputPassword"));
password.sendKeys("rahul123");
WebElement signin=driver.findElement(By.className("signInBtn"));
signin.click();

Thread.sleep(2000);
WebElement error=driver.findElement(By.cssSelector("p.error"));
System.out.println(error.getText());
WebElement forgot=driver.findElement(By.linkText("Forgot your password?"));
forgot.click();
//driver.findElement(By.xpath("//input[@placeholder='Name']"))
//		driver.findElement(By.xpath("input[placeholder='Email']));
	}

}
