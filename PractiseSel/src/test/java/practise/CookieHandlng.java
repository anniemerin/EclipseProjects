package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class CookieHandlng {
	WebDriver driver;
  @Test
  public void cookieHandling() throws InterruptedException {
	  //Thread.sleep(3000);

	  driver.findElement(By.xpath("//input[@value=' Click Here to Log In ']")).click();
	  driver.findElement(By.xpath("//input[@name='LoginName']")).sendKeys("AutomationTestGuide");
	  driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("busyQA");
	 // Thread.sleep(3000);

	  driver.findElement(By.xpath("//input[@value='Log Me In']")).click();
//	  Set<Cookie> allCookies = driver.manage().getCookies();
//	  for(Cookie cookie:allCookies)
//		  System.out.println(cookie.getName()+":" + cookie.getValue());
	  
      Cookie newCookie = new Cookie("newcookieName", "newcookieValue", "memotome.com", "/", null, false, false);
      driver.manage().addCookie(newCookie);
      
      Set<Cookie> allCookies = driver.manage().getCookies();
      
	  for(Cookie cookie:allCookies)
		  System.out.println(cookie.getName()+":" + cookie.getValue());
	 
	//  driver.manage().deleteCookieNamed("newcookieName");
	  driver.manage().deleteCookie(newCookie);
	  Set<Cookie> allCookies1 = driver.manage().getCookies();
	  System.out.println("After deletion");
	  for(Cookie cookie:allCookies1)
		  System.out.println(cookie.getName()+":" + cookie.getValue());
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.navigate().to("http://www.memotome.com/");

	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }
  

}
