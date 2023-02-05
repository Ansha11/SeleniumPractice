package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommandsEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();

driver.get("http://www.opesmount.in/grocerystore1/");
System.out.println(driver.getTitle());
driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
System.out.println(driver.getTitle());
driver.navigate().back();
System.out.println(driver.getTitle());
driver.navigate().forward();
System.out.println(driver.getTitle());
driver.navigate().refresh();
	}

}
