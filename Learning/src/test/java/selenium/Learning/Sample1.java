package selenium.Learning;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bonigarcia.dev/selenium-webdriver-java/web-form.html");
		driver.findElement(By.id("my-text-id")).sendKeys("Srikant");
		driver.findElement(By.name("my-password")).sendKeys("Kumar");
				
		driver.findElement(By.xpath("//label[contains(text(),'Textarea')]/textarea")).sendKeys("Xpath located By Aselam");
//		driver.findElement(By.name("my-disabled")).sendKeys("Srikant"); // This will fail as the field is disabled -> exception element not interactable.
		boolean active = driver.findElement(By.name("my-disabled")).isEnabled();
			
		if (active) {
			driver.findElement(By.name("my-disabled")).sendKeys("Srikant");
			} else {
			System.out.println("Element is disabled");
			}
			
		String readOnlyAttribute = driver.findElement(By.name("my-readonly")).getAttribute("readonly");
		System.out.println("Read only attribute value"+readOnlyAttribute);
		if (!readOnlyAttribute.equals("true")) {
			driver.findElement(By.name("my-readonly")).sendKeys("Srikant");
			}
			
		driver.findElement(By.id("my-text-id")).clear();

	}

}
