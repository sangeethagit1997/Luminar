package testngpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlingPg {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void windowHandling() {
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p[1]/a")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for(String handle:allWindows) {
			if(!parentWindow.equals(handle)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("Sangeetha@yahoo.com");
				//driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
	}

}
