package SeleniumPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\anupk\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
    	
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://www.amazon.in/";
            // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys('1');
	}

}
