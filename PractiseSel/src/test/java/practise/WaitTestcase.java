package practise;

import org.testng.annotations.Test;
import org.openqa.selenium.ElementNotInteractableException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class WaitTestcase {
	
WebDriver driver;
String errorMessage="Invalid credentials";
  
	  	@Test (enabled=true)
	  	///Test Case 1: Wrong Username and wrong password
	    public void TestCas1() throws InterruptedException {
	  		Thread.sleep(2000);
	  		driver.findElement(By.name("username")).sendKeys("Admin");
	  		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("aadmin123");
	  		driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
	  		//Thread.sleep(1000);
	  		try {
	  			
	  			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
		  		WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.oxd-alert-content-text")));
		  		String invalidLogin= element.getText();
		  		//System.out.println(invalidLogin);
		  		if (invalidLogin.equals(errorMessage))
		  		{
		  			System.out.println("Valid Error Message");
		  		}else
		  		{
		  			System.out.println("Incorrect error message");
		  		}
		  		
	  		}catch (Exception e)
	  		{
	  			System.out.println("Print error message"+e);
	  			
	  			
	  		}
	  		
	  		
	}

	    @BeforeMethod
	    public void beforeMethod()  {
	  	  
	  		driver=new ChromeDriver();
	  		driver.get("https://opensource-demo.orangehrmlive.com/");	  		
	  		driver.manage().window().maximize();
	  		
	  		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  		
	    }

	    @AfterMethod
	    public void afterMethod() {
	  	  
	  	  driver.quit();
	    }

}
