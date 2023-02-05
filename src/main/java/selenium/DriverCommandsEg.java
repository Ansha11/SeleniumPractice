package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverCommandsEg {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("http://www.opesmount.in/grocerystore1/");
System.out.println(driver.getTitle());

String titleActual=driver.getTitle();
String titleExpected="opesmount.in";

if(titleActual.equalsIgnoreCase(titleExpected)){
	System.out.println("title matches");
}else
{
	System.out.println("title mismatch");
}
System.out.println(driver.getCurrentUrl());
String urlActual=driver.getCurrentUrl();
String urlExpected="http://www.opesmount.in/grocerystore1/";

if(urlActual.equalsIgnoreCase(urlExpected)) {
	System.out.println("URL matches");
}
else {
	System.out.println("URL mismatch");
}
driver.close();
	}

}
