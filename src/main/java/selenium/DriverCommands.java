package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommands {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.google.com/mail/u/0/?pli=1#inbox");
String titleActual=driver.getTitle();
String titleExpected="Gmail";
if(titleActual.equalsIgnoreCase(titleExpected)) {
	System.out.println("title matched");
}else
	{System.out.println("mismatch");}
//System.out.println(driver.getTitle());
//System.out.println(driver.getCurrentUrl());
driver.close();

	}

}
