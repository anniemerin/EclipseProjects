package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class WindowHandle {
	WebDriver driver;
	String parentWindowHandle;
  @Test
  public void window() {
	  
	  parentWindowHandle=driver.getWindowHandle();
	  driver.findElement(By.xpath("//a[contains(@href,'.dev')]")).click();
	  String newTabHandle=driver.getWindowHandle();
	  String title = driver.getTitle();
	  
	  System.out.println("New title of the page is: "+title);
	  System.out.println("parent handle is     : "+parentWindowHandle);
	  System.out.println("New window handle is : "+newTabHandle);
	  
	  
	  Set<String> windowHandles = driver.getWindowHandles();
	  // Iterate through window handles and print them
    for (String handle : windowHandles) {
         System.out.println("Window Handle: " + handle);
         driver.switchTo().window(handle);
         System.out.println("Title of the page: "+driver.getTitle());
    }
	 
  }
  
  @Test
  public void newWindow() {
	  
	  parentWindowHandle=driver.getWindowHandle();
	  driver.findElement(By.xpath("//a[contains(@href,'Sep')]")).click();
	  driver.findElement(By.xpath("//button[contains(@class,'prim')]")).click();
	  
	  System.out.println("\nMultiple Window");
	  	  
	  Set<String> windowHandles = driver.getWindowHandles();
	  // Iterate through window handles and print them
	  for (String handle : windowHandles) {
         System.out.println("Window Handle: " + handle);
         driver.switchTo().window(handle);
         System.out.println("Title of the page: "+driver.getTitle());
    }
	 
  }
  
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
  }
  

  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }
  

}
