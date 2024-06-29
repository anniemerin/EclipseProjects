package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class Calendar1 {
	WebDriver driver;
  @Test
  public void selectDate() {
	  
	  String month = "Aug";
	  String year = "2024";
	  int day = 20;
	  driver.findElement(By.id("departon")).click();
	  
	  WebElement yearElement=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	  Select yearSelect=new Select(yearElement);
	  yearSelect.selectByVisibleText(year);
	  
	  WebElement monthElement=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	  Select monthSelect=new Select(monthElement);
	  monthSelect.selectByVisibleText(month);
	  
	  driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']"));
	  List<WebElement> datePicker = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td/a"));
	  for (WebElement ele: datePicker) {
    	  
    	  String dateInCal = ele.getText();
    	  if (dateInCal.equals(String.valueOf(day))) {
    		  ele.click();
    		  break;
    	  }
      }

	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver=new ChromeDriver();
	  driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
