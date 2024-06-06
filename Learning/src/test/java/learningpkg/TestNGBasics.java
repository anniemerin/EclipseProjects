package learningpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGBasics {
  @Test
  public void f() {
	  
	  System.out.println("This is my first method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is my beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("This is my afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is my beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This is my afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This is my beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("This is my afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is my beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is my afterSuite");
  }

}
