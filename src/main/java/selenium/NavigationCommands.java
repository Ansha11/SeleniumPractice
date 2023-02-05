package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new  ChromeDriver();
driver.get("https://meet.google.com/");
System.out.println(driver.getTitle());
		driver.navigate().to("https://www.google.com/intl/en-GB/gmail/about/");
		System.out.println(driver.getTitle());
		
	driver.navigate().back();
	System.out.println(driver.getTitle());
		
		/*driver.navigate().forward();
		System.out.println(driver.getTitle());*/
		//driver.navigate().back();
		//System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
 driver.navigate().refresh();
	}
}

		
		
		
		