package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsCopyPastePgm {
ChromeDriver driver;
@BeforeTest
public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?ref_id=&sangeetha.2024");
	driver.manage().window().maximize();
}
@Test
public void actnsMeth() {
	WebElement fullname = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
	WebElement Rediff = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
	fullname.sendKeys("Sangeetha Suresh");
	Actions act = new Actions(driver);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	act.keyDown(Rediff,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
}

}
