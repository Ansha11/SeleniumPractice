package testNgpgms;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import java.util.List;
public class RadiobuttonEg {
	WebDriver driver;
  @Test
public void validation() {
	  
	  List<WebElement>obj=driver.findElements(By.xpath("//input[@name='tripType']"));
obj.get(0).click();
//handling dropdown
WebElement passenger=driver.findElement(By.xpath("//select[@name='passCount']"));
Select obj1=new Select(passenger);
obj1.selectByIndex(1);
WebElement depart=driver.findElement(By.xpath("//select[@name='fromPort']"));
Select obj2=new Select(depart);
obj2.selectByValue("London");
WebElement month1=driver.findElement(By.xpath("//select[@name='fromMonth']"));
Select obj3=new Select(month1);
obj3.selectByVisibleText("April");
WebElement day1=driver.findElement(By.xpath("//select[@name='fromDay']"));
Select obj4=new Select(day1);
obj4.selectByIndex(1);
WebElement arrival=driver.findElement(By.xpath("//select[@name='toPort']"));
Select obj5=new Select(arrival);
obj5.selectByValue("Paris");
WebElement month2=driver.findElement(By.xpath("//select[@name='toMonth']"));
Select obj6=new Select(month2);
obj6.selectByVisibleText("March");
WebElement day2=driver.findElement(By.xpath("//select[@name='toDay']"));
Select obj7=new Select(day2);
obj7.selectByValue("5");
List<WebElement>alldata=obj7.getOptions();
int a=alldata.size();
System.out.println("size= "+a);
for(int i=0;i<a;i++) {
	String s=alldata.get(i).getText();
	System.out.println(s);
	}
List<WebElement>s1=driver.findElements(By.xpath("//input[@name='servClass']"));
s1.get(2).click();

WebElement airline=driver.findElement(By.xpath("//select[@name='airline']"));
Select s2=new Select(airline);
List<WebElement>data=s2.getOptions();
int b=data.size();
System.out.println("size= "+b);

for(int i=0;i<b;i++) {
	String text=data.get(i).getText();
	System.out.println(text);

}
s2.selectByVisibleText("Unified Airlines");

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	  driver.manage().window().maximize();
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
