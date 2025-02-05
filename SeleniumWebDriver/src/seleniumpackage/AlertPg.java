package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPg {
ChromeDriver driver;
@Before
public void setUp() {
	driver = new ChromeDriver();
	driver.get("file:///C:/Users/TLTUser/Desktop/Luminar/Htmlfile.html");
}
@Test
public void alertHandling() {
	driver.findElement(By.xpath("/html/body/input[1]")).click();
	Alert a = driver.switchTo().alert();
	String alertText = a.getText();
	System.out.println(alertText);
	a.accept();
	driver.findElement(By.xpath("//input[2]")).sendKeys("Sangeetha");
	driver.findElement(By.xpath("//input[3]")).sendKeys("Suresh");
}
}
