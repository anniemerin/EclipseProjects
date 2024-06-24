package practise;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;

public class AlertsTest {
	
	WebDriver driver;
  @Test
  public void alertwithOK() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href,'#OK')]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//button[contains(@class,'btn-danger')]")).click();
	  Thread.sleep(2000);

	  Alert alert = driver.switchTo().alert();
	  System.out.println("Message on alertbox :"+alert.getText());
	  alert.accept();
  }
  
  @Test
  public void alertwithOKandCancel() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href,'Cancel')]")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//button[contains(@class,'btn-primary')]")).click();
	  Thread.sleep(2000);

	  Alert alert = driver.switchTo().alert();
	  System.out.println("Message on alertbox :"+alert.getText());
	  alert.dismiss();
	  System.out.println("Message :"+driver.findElement(By.xpath("//p[@id='demo']")).getText());
  }
  
  
  @Test
  public void alertwithTextBox() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//a[contains(@href,'Textbox')]")).click();
	  Thread.sleep(2000);

	  driver.findElement(By.xpath("//button[contains(@class,'btn-info')]")).click();
	  Thread.sleep(2000);

	  Alert alert = driver.switchTo().alert();
	  System.out.println("Message on alertbox :"+alert.getText());
	  alert.sendKeys("Merin");
	  alert.accept();
	  Thread.sleep(2000);

	  System.out.println("Message :"+driver.findElement(By.xpath("//p[@id='demo1']")).getText());
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @AfterClass
  public void afterClass() {
  }

}
