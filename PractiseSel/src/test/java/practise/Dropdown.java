package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class Dropdown {
	WebDriver driver;
  @Test
  public void Register() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("FirstName");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("LastName");
	  driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Sampletext");
	  driver.findElement(By.xpath("//input[contains(@type,'mail')]")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("306-678-9990");
	  WebElement genderMaleElement=driver.findElement(By.xpath("//input[@value='Male']"));
	  WebElement genderFemaleElement=driver.findElement(By.xpath("//input[@value='FeMale']"));
	  genderMaleElement.click();
	  if(!(genderMaleElement.isSelected()))
	  {
		  genderMaleElement.click();
	  }
	  
	  else //(!(genderFemaleElement.isSelected()))
	  {
		  genderFemaleElement.click();
	  }
	  WebElement hobbiesCricketElement=driver.findElement(By.xpath("//input[@id='checkbox1']"));
	  WebElement hobbiesMoviesElement=driver.findElement(By.xpath("//input[@id='checkbox2']"));
	  WebElement hobbiesHockeyElement=driver.findElement(By.xpath("//input[@id='checkbox3']"));
	  hobbiesCricketElement.click();
	  hobbiesMoviesElement.click();
	  hobbiesHockeyElement.click();
	  if ((hobbiesCricketElement.isSelected()))
	  {
		  hobbiesCricketElement.click();
		//  hobbiesCricketElement.clear();
	  }
	  WebElement skillsElement=driver.findElement(By.xpath("//select[@id='Skills']"));
	  Select selectSkills=new Select(skillsElement);
	  selectSkills.selectByVisibleText("Analytics");
	  Thread.sleep(2000);
	  selectSkills.selectByValue("APIs");
	  selectSkills.selectByIndex(7);
	 
	  Thread.sleep(2000);
		
	  WebElement languageElement=driver.findElement(By.xpath("//div[@id='msdd']/parent::multi-select")); 
	  languageElement.click(); 
			
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView();", languageElement);
			 
			//	 Thread.sleep(2000); 
	  WebElement arabicElement=languageElement.findElement(By.xpath("//a[text()='Arabic']"));
	  arabicElement.click();
		  
	  WebElement bulgarianElement = languageElement.findElement(By.xpath("//a[text()='Bulgarian']"));
	  bulgarianElement.click();
		  
	  WebElement catalanElement = languageElement.findElement(By.xpath("//a[text()='Catalan']"));
	  catalanElement.click();
		  
	  WebElement germanElement = languageElement.findElement(By.xpath("//a[text()='German']"));
	  germanElement.click();
		
	  WebElement vienElement = languageElement.findElement(By.xpath("//a[text()='Vietnamese']"));
	  vienElement.click();	
	  
	  System.out.println("Keyword is present: "+driver.getPageSource().contains("Register"));
	  
		 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  ChromeOptions ops = new ChromeOptions();
      ops.addArguments("--disable-notifications");
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Register.html");
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
