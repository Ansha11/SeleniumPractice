package testNGexamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationEg {
  @Test
  public void f() {
	  System.out.println("I'm in test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I'm in before method");

  }
 

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I'm in after method");

  }

  @BeforeClass
  public void beforeClass() {	  System.out.println("I'm in before class");

  }

  @AfterClass
  public void afterClass() {	  System.out.println("I'm in after class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I'm in before test");

  }

  @AfterTest
  public void afterTest() {	  System.out.println("I'm in after test");

  }

  @BeforeSuite
  public void beforeSuite() {	  System.out.println("I'm in before siute");

  }

  @AfterSuite
  public void afterSuite() {	  System.out.println("I'm in after suite");

  }

}
