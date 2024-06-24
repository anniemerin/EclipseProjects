package practise;

import org.testng.annotations.Test;
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

public class InputType {
	WebDriver driver;
	
  @Test
  public void webForm() {
	  
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));
	  //WebElement textInputElement=
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='my-text']"))).sendKeys("sampletext");
	  driver.findElement(By.xpath("//input[contains(@name,'my-pass')]")).sendKeys("samplepassword");
	  driver.findElement(By.xpath("//textarea[contains(@name,'my-text')]")).sendKeys("sampletext enered in text area field");
	  boolean active=driver.findElement(By.xpath("//input[contains(@name,'my-dis')]")).isEnabled();
	  if (active)
	  {
		  driver.findElement(By.xpath("//input[contains(@name,'my-dis')]")).sendKeys("sample disabledfield");
	  }else
	  {
		  System.out.println("Disabled");
	  }
	  String readonlyInput=driver.findElement(By.xpath("//input[contains(@name,'my-rea')]")).getAttribute("readonly");
	  System.out.println("Readonly attribute value: "+readonlyInput);
	  if(!(readonlyInput.equals("true")))
		  
	  {
		  driver.findElement(By.xpath("//input[contains(@name,'my-rea')]")).sendKeys("Samplevalue");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//textarea[contains(@name,'my-text')]")).clear();
  }

  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
//	  driver.quit();
  }

}
