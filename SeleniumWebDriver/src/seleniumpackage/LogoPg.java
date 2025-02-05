package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoPg {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?ref_id=&sangeetha.2024");
	}
	@Test
	public void logobtnAvail() {
		WebElement logo = driver.findElement(By.xpath("/html/body/center/form/div/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b1 = logo.isDisplayed();
		if(b1) {
			System.out.println("Logo Displayed");
		}
		else {
			System.out.println("Logo not displayed");
		}
		WebElement button = driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[34]/td[2]/input[6]"));
		boolean b2 = button.isEnabled();
			if(b2) {
				System.out.println("Create Account button is enabled");
			}
			else {
				System.out.println("Create Account button is disabled");

			}
		}
	}


