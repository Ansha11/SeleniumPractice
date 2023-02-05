package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRahulshetty {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","/Users/Sanoob/Documents/chromedriver_mac64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
driver.manage().window().maximize();
	
driver.findElement(By.id("inputUsername")).sendKeys("Rahul");         //sending values to username
WebElement password=driver.findElement(By.name("inputPassword"));  
password.sendKeys("rahul123");                                        //sending values to  password
//WebElement checkbox1=driver.findElement(By.id("chkboxOne"));
//checkbox1.click();
WebElement checkbox2=driver.findElement(By.id("chkboxTwo"));           //clicking checkboxes
checkbox2.click();
WebElement signin=driver.findElement(By.className("signInBtn"));
signin.click();                                                          //clicking signin button
Thread.sleep(2000);
WebElement error=driver.findElement(By.cssSelector("p.error"));
System.out.println(error.getText());                                                      //printing the message incorrect username or password
WebElement forgot=driver.findElement(By.linkText("Forgot your password?"));
forgot.click();                                                                              //clicking forgot button
WebElement name=driver.findElement(By.xpath("//input[@placeholder='Name']"));
name.sendKeys("rahul");                                                                        //sending values to name field
WebElement email=driver.findElement(By.cssSelector("input[placeholder='Email']"));
email.sendKeys("rahul@gmail.com");     //sending values to email field
email.clear();
email.sendKeys("rahul123@gmail.com");                 
WebElement phone=driver.findElement(By.xpath("//input[@type='text'][3]"));                       //x path is selected using index least preferred method
phone.sendKeys("9375896889");                                                                   
WebElement reset=driver.findElement(By.cssSelector(".reset-pwd-btn"));
//driver.findElement(By.xpath("//div/button[2]")).click();
reset.click();                                                                                    // css- tagname.classname or .classname clicking reset button
WebElement gotologin=driver.findElement(By.xpath("//button[@class='go-to-login-btn']"));
gotologin.click();         //clicking gotologin button
driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();        //parent-xpath/child-tagname  ( Go to log in)

      Thread.sleep(3000);  
      
      WebElement user=driver.findElement(By.cssSelector("#inputUsername"));                        //tagname#id   or #id
      user.sendKeys("rahul");
      WebElement pass=driver.findElement(By.cssSelector("input[type*='pass']"));              //dynamic attribute value(using *)  
      pass.sendKeys("rahulshettyacademy");      // pass only given it can be password /pass** if it is dynamic value (varying) can use * 
     driver.findElement(By.id("chkboxTwo")).click();
     
      driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();              //dynamic attribute value (contains)  
                                                                                                           // (sign in button clicking)
	}

}
//input[type='text']:nth-child(4) using CSS