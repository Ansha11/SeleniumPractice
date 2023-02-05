package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver =new ChromeDriver();
driver.get("https://selenium.obsqurazone.com/index.php");

System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());

/*System.setProperty("webdriver.edge.driver","/Users/Sanoob/Documents/edgedriver_mac64/msedgedriver");
WebDriver driver2 =new EdgeDriver();
driver2.get("https://www.amazon.com.au/gp/css/homepage.html");
System.out.println(driver2.getTitle());
System.out.println(driver2.getCurrentUrl());
System.out.println(driver2.getPageSource());*/



/*System.setProperty("webdriver.gecko.driver","/Users/Sanoob/Documents/gecko/geckodriver");
WebDriver driver1 =new FirefoxDriver();
driver1.get("https://selenium.obsqurazone.com/index.php");
System.out.println(driver1.getTitle());*/

//driver1.close();
//driver1.quit();
	}

}