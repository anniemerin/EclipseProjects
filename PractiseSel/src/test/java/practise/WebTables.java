package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class WebTables {
	WebDriver driver;
	 List <WebElement> columns;

  @Test
  public void firstTable() {
	  WebElement tableElement=driver.findElement(By.xpath("//table[@id='table1']"));
	  List <WebElement> rows=tableElement.findElements(By.tagName("tr"));
	  
	  System.out.println("No. of rows: "+rows.size());
	  for(WebElement row:rows) {
		  columns =row.findElements(By.tagName("td"));
		  for (WebElement column : columns) {
              System.out.print(column.getText() + "\t");
          }
		  System.out.println();
	  }
		  System.out.println("No. of columns: "+columns.size());
		
	 
	 String[] lastNames = {"Smith", "Bach", "Doe", "Conway"};
	 for (int i = 1; i <rows.size(); i++) {
         WebElement row = rows.get(i);
		columns =row.findElements(By.tagName("td"));
		WebElement column=columns.get(0);
		String lName=column.getText();
        System.out.println("Lname from array is: "+ lastNames[i-1] + " Lname from table is: "+lName);

        Assert.assertEquals(lName, lastNames[i-1]);
	 }
		  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/tables");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
