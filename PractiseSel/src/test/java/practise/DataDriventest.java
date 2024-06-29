package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DataDriventest {
	WebDriver driver;
  @Test
  public void excelAction() throws IOException {
	  String path="C:\\Users\\anupk\\OneDrive\\Desktop\\Automation Learning\\SelCodebase\\SelniumProject\\src\\test\\java\\selenium\\ExcelFiles\\DriverFileIP.xlsx";
	  
	  FileInputStream inputstream=new FileInputStream(path);
	  XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
	  XSSFSheet sheet=workbook.getSheet("MercuryLogin");
	  int rowcount=sheet.getLastRowNum();
	  for (int i=1;i<=rowcount;i++)
	  {
		  XSSFRow row=sheet.getRow(i);
		  String userName=row.getCell(0).toString();
		  String passWord=row.getCell(1).toString();
		  String result =ValidateLogin(userName,passWord);
		  XSSFCell newcell=row.createCell(2);
      	  newcell.setCellValue(result);
    
	  }
	  FileOutputStream outputStream = new FileOutputStream(path);
      
      // Close streams
      workbook.write(outputStream);
      workbook.close();
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
  }
  public String ValidateLogin(String uName, String pass) {
	  String result = "Fail";
	  driver.get("https://demo.guru99.com/test/newtours/login.php");
	
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uName);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  String actualTitle = driver.getTitle();
	  System.out.println("Actual Title is :"+actualTitle);
	  String expectedTitle = "Login: Mercury Tours";
	  if(actualTitle.equals(expectedTitle)) {
		  result = "Pass";
	  }
	  return result;
  }
}
