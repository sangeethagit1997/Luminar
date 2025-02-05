package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragNDrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	}
	@Test
	public void dragNDrop() {
		Actions act = new Actions(driver);
		WebElement BankSource = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));//drag source
		WebElement BankDestination = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));//drop destination
		WebElement Amount1Source = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement Amount1Destination = driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		act.dragAndDrop(BankSource, BankDestination).perform();
		act.dragAndDrop(Amount1Source, Amount1Destination).perform();
		
	}

}
