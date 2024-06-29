package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class MouseAction {
	WebDriver driver;
  @Test (enabled=false)
  public void dragandDrop() throws InterruptedException {
	  
	  WebElement dragElement=driver.findElement(By.id("mongo"));
	  WebElement targetElement=driver.findElement(By.xpath("//div[@id='droparea']"));
	  Actions drag=new Actions(driver);
	  Thread.sleep(2000);
	  drag.dragAndDrop(dragElement,targetElement).build().perform();	  
	  
  }
  
  
  @Test (enabled=false)
  public void mouseClicks() throws InterruptedException {
	  
	  WebElement newLink=driver.findElement(By.xpath("//a[text()='Interactions ']"));
	  Actions clicks=new Actions(driver);
	  Thread.sleep(3000);
	  clicks.moveToElement(newLink).build().perform();
	  Thread.sleep(3000);
	  clicks.contextClick(newLink).build().perform();
	  
      driver.navigate().to("https://demo.automationtesting.in/Selectable.html");
      WebElement doubleclick = driver.findElement(By.xpath("//b[contains(text(),'Sakinalium - Readability')]"));
      clicks.doubleClick(doubleclick).build().perform();
	  
  }
  
  
  @Test 
  public void slider() throws InterruptedException {
	  driver.get("https://demo.automationtesting.in/Slider.html");
	  WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/a"));
	  Actions actions = new Actions(driver);
	  Thread.sleep(3000);
	 actions.dragAndDropBy(slider, 500, 0).build().perform();
	
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Static.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  
  }
  
  

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }
  

}
