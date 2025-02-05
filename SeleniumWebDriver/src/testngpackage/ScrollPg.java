package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScrollPg<JavascriptExecuter> {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("bags");
		driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		//Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); // Scroll down by 500 pixels
	

		}
}
