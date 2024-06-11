package learningpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LocatorsBasics {
	WebDriver driver;
	  @Test
	  public void openUrl() {
		  WebElement usernameField = driver.findElement(By.name("username"));
	      usernameField.sendKeys("Admin");
	      
	      WebElement passwordField = driver.findElement(By.name("password"));
	      passwordField.sendKeys("admin123");
	      
	    driver.findElement(By.className("orangehrm-login-button")).click();
	  }
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the name of Browser"); String browserName =
		 * sc.nextLine();
		 * 
		 * if(browserName.equals("firefox")) { driver = new FirefoxDriver(); }else if
		 * (browserName.equals("edge")){ driver = new EdgeDriver(); } else { driver =
		 * new ChromeDriver(); } sc.close(); }
		 */
		  driver = new ChromeDriver();
		  
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(4000);
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
