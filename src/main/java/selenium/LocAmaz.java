package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocAmaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","/Users/Sanoob/Documents/edgedriver_mac64/msedgedriver");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		WebElement login=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		login.click();
		WebElement email=driver.findElement(By.id("ap_email"));
		email.sendKeys("9497883663");
		System.out.println(email.getAttribute("name"));
		System.out.println(email.getTagName());
		
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		
		WebElement password=driver.findElement(By.id("ap_password"));
		password.sendKeys("ansha@123");
		System.out.println(password.getAttribute("tabindex"));
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}

}
