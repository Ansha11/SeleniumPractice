package seleniumPractice;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsFacebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));   // locating element email using id
		email.sendKeys("anshavm");                             // sending values 
		email.clear();
		System.out.println(email.getTagName());
		System.out.println(email.getAttribute("class"));           // get the value of attribute 'class'
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("ansha");
		System.out.println(password.getAttribute("name"));           //printing the attribute value of 'name'
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		Point q=login.getLocation();                               //get the location of login field
		System.out.println(q.getX());
		System.out.println(q.getY());
		
	}

}
