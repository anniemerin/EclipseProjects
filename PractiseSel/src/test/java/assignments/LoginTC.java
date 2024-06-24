package assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTC {
	WebDriver driver;  
	String errorMessage="Invalid credentials";

  @Test (enabled=true)
	///Test Case 1: Wrong Username and wrong password
public void TestCas1()  {
		
		driver.findElement(By.name("username")).sendKeys("user");
		driver.findElement(By.cssSelector("input[placeholder=Password]")).sendKeys("user123");
		
}
	@Test (enabled=true)
	///Test Case 2: Correct Username and wrong password
public void TestCas2()  {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("user123");
		
 }
	@Test (enabled =true)
	///Test Case 3: Wrong Username and correct password
public void TestCas3()  {
	
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("user");
		driver.findElement(By.xpath("//input[contains(@name,'word')]")).sendKeys("admin123");
		
 }
	@Test
	///Test Case 4: correct Username and correct password
public void TestCas4()  {
	
		driver.findElement(By.xpath("//input[contains(@name,'user')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name,'word')]")).sendKeys("admin123");
		
 }
  @BeforeMethod
  public void beforeMethod() {
	  
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  
	  try {
		    driver.findElement(By.cssSelector("button.orangehrm-login-button")).click();
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	  		WebElement errorElement=wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("p.oxd-alert-content-text")));
	  		String actualErrorMessage= errorElement.getText();
	  		if (actualErrorMessage.equals(errorMessage))
	  		{
	  			System.out.println("Valid Error Message");
	  		}else
	  		{
	  			System.out.println("Error message does not match.");
	  		}
	  		
		}catch (Exception e)
		{
			System.out.println("Login success");
			System.out.println("Title of the Page: "+driver.getTitle());		
			driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logout success");	
			
		}finally
		{
			driver.quit();
		}
  }

 

}
