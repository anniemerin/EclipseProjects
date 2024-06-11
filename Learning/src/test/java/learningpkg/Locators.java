package learningpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;

//import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;


public class Locators {
	WebDriver driver;
  @Test(enabled=false)
  public void byId() {
	  WebElement usernameField = driver.findElement(By.id("email"));
      usernameField.sendKeys("Merin");     
      
  }
  @Test(enabled=false)
  public void byName() {
	  WebElement usernameField = driver.findElement(By.name("password"));
      usernameField.sendKeys("Merin123");     
      
  }
  
  @Test
  public void byLink() throws InterruptedException {
	  
	  driver.findElement(By.linkText("REGISTER")).click();
	  Thread.sleep(4000);
      
  }
  @Test
  public void byPartialLinkText() throws InterruptedException {

	  driver.findElement(By.partialLinkText("PORT")).click();
	  Thread.sleep(4000);
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  Thread.sleep(4000);
  }

  @AfterMethod	
  public void afterMethod() {
	//  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
	  

	  driver = new ChromeDriver();
	  
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	  driver.manage().window().maximize();
	 
  }

  @AfterClass
  public void afterClass() {
  }

}
