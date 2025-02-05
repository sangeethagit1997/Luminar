package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepackage.FbLoginPage;

public class FbLoginTest {

	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void testLogin() {
		FbLoginPage ob = new FbLoginPage(driver);
		ob.setValues("abc@yopmail.com", "ababacd");
		ob.login();
	}
}
