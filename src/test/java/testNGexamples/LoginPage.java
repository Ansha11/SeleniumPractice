package testNGexamples;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class LoginPage {
  @Test(priority=2)
  public void email() {
	  System.out.println("Email");
  }
  @Test(priority=1)
  public void phonenumber() {
	  System.out.println("Phone number");
  }
}
