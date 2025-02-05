package testngpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task1 {//demoguru99
ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
}
@Test
public void actionsMethod() {
	WebElement fbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act = new Actions(driver);
	act.contextClick(fbtn).perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[7]")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	Alert a = driver.switchTo().alert();
	String alertText = a.getText();
	System.out.println("Alert text from first button "+alertText);
	a.accept();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	WebElement secbtn = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	act.doubleClick(secbtn).perform();
	
	Alert b = driver.switchTo().alert();
	String alertText2 = b.getText();
	System.out.println("Alert text from 2nd button "+alertText2);
	b.accept();
	
	
}
}
