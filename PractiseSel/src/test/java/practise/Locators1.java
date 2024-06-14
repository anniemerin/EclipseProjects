package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class Locators1 {
	WebDriver driver;
	
  @Test
  public void RegisterPage() {
	  //driver.findElement(By.cssSelector(null))
	  //Contact Information
	  driver.findElement(By.name("firstName")).sendKeys("Merin");
	  driver.findElement(By.name("lastName")).sendKeys("Thomas");
	  driver.findElement(By.name("phone")).sendKeys("3067152864");
	  driver.findElement(By.cssSelector("input[name=userName]")).sendKeys("merinanniethomas@gmail.com");
	  
	  //  Mailing Information

	  driver.findElement(By.name("address1")).sendKeys("15-112 110th St");
	  driver.findElement(By.name("city")).sendKeys("Saskatoon");
	  driver.findElement(By.name("state")).sendKeys("SK");
	  //driver.findElement(By.name("postalCode")).sendKeys("S7N1R9");
	  driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("S7N1R9");
	  
	  driver.findElement(By.name("country")).sendKeys("CANADA");
	  
	  //  User Information
	  
	  driver.findElement(By.id("email")).sendKeys("merinannie");
	  driver.findElement(By.name("password")).sendKeys("abcd@123");
	  driver.findElement(By.name("confirmPassword")).sendKeys("ab@123");
	  //driver.findElement(By.name("submit")).click();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
