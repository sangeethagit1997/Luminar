package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffCheckAvailability {
ChromeDriver driver;
@Before
public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?ref_id=&sangeetha.2024");
}
@Test
public void checkAvail() {
WebElement button = driver.findElement(By.xpath("//*[contains(@name,'btnchkavail')]"));	
System.out.println("Check Availability button text is "+button.getAttribute("value"));
}
}
