package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathPgm {
	ChromeDriver driver;
	@Before
	
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void relativeXpathPm() {
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vivek@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("appu");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
