package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BookCartBaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/login");
		driver.manage().window().maximize();
	}

}
