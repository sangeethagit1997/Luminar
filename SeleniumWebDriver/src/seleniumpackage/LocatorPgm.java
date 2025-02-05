package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPgm {
	ChromeDriver driver;
	
	@Before
	
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void locatorsPg() {
		driver.findElement(By.name("email")).sendKeys("sangeetha@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("san123");
		driver.findElement(By.name("login")).click();
	}
}
