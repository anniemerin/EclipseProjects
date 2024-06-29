package practise;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;

public class ExcelOperations {
  @Test
  public void readFromExcel() throws IOException {
	  String path="C:\\Users\\anupk\\OneDrive\\Desktop\\Automation Learning\\SelCodebase\\SelniumProject\\src\\test\\java\\selenium\\ExcelFiles\\DriverFileIP.xlsx";
	  
	  try {
		FileInputStream inputstream=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		
		XSSFSheet sheet= workbook.getSheet("EmployeeData");
		int rownum=sheet.getLastRowNum();
		int columnnum=sheet.getRow(0).getLastCellNum();
		for (int i=0;i<rownum;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columnnum;j++)
			{
				String value=row.getCell(j).toString();
				System.out.print("\t"+value);
			}
			System.out.println();
		}
		inputstream.close();
        workbook.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  
  @Test
  public void writeToExcel() throws IOException {
	  
	  String path="C:\\Users\\anupk\\OneDrive\\Desktop\\Automation Learning\\SelCodebase\\SelniumProject\\src\\test\\java\\selenium\\ExcelFiles\\DriverFileOP.xlsx";
	  try {
		FileOutputStream outputstream=new FileOutputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet= workbook.createSheet("EmployeeData");
		int num=1;
		for (int i=0;i<5;i++)
		{
			XSSFRow row=sheet.createRow(i);
			for (int j=0;j<4;j++)
			{
				row.createCell(j).setCellValue(num);
				num++;
			}
		}
		workbook.write(outputstream);

      
        outputstream.close();
        workbook.close();
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  

}
