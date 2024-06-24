package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Links {
	WebDriver driver;
  @Test
  public void f() {

	int countofLinks=driver.findElements(By.xpath("//a[contains(@href,'.')]")).size();
	System.out.println("No.of links : "+countofLinks);
	
	List <WebElement> listofLinks =driver.findElements(By.xpath("//a[contains(@href,'.')]"));
	for(WebElement links : listofLinks) {
		System.out.println(links.getAttribute("href"));
		String url= links.getAttribute("href");
		verifyLink(url);
		// Check if the link is displayed
	      if (links.isDisplayed()) {
	          System.out.println("The link is displayed.");
	      } else {
	          System.out.println("The link is not displayed.");
	      }

	}
		 			
  }
 public void verifyLink(String url) {

	try {
		URL linkURL=new URL(url);
		HttpURLConnection connection=(HttpURLConnection)linkURL.openConnection();
		connection.setConnectTimeout(3000);
		connection.connect();
		if(connection.getResponseCode()==200)
		{
			System.out.println(url + " : "+connection.getResponseMessage());
		}else
		{
			System.out.println(url + " : "+connection.getResponseMessage());
		}
	}catch (Exception e)
	{
		System.out.print(url+" Link is broken");
	}
   
  }
  @BeforeMethod
  public void beforeMethod() {
	 
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/newtours/register.php");
	 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.manage().window().maximize();
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
