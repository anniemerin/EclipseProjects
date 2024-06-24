package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class iFramesTest {
	
	WebDriver driver;
  @Test
  public void iFramebyId() throws InterruptedException {
	  driver.switchTo().frame("singleframe");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Merin");
	 
  }
	  @Test
	  public void iFramebyIndex() throws InterruptedException {
		  driver.switchTo().frame(0);
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Annie");
	  }
	  
	  @Test
	  public void iFrameCount() throws InterruptedException {
		  List <WebElement> frames=driver.findElements(By.tagName("iframe"));
		  for(int i=0;i<frames.size();i++)
		  {
			  WebElement frame=frames.get(i);
			  System.out.println("Index "+i+" name : "+frame.getAttribute("id"));
		  }
	  }
	  
	  @Test 
	  public void MultiFrame() throws InterruptedException {
		  driver.switchTo().frame("singleframe");
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Merin");
		  Thread.sleep(2000);
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		  driver.switchTo().frame(2);
		  WebElement frameIdentifier = driver.findElement(By.xpath("//h5[text()='Nested iFrames']/parent::div/iframe"));
		  driver.switchTo().frame(frameIdentifier);
		  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thomas");
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//a[contains(text(),'Single Iframe ')]")).click();

	  }
	  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
