package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPgm {
	
	ChromeDriver driver;
	@Before
	
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	
	public void xpathPgm() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form/div[1]/div[1]/input")).sendKeys("sanisha@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div/div[2]/div/input")).sendKeys("sanisha12");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	}

}
