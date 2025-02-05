package testngpackage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertion {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void titleVerifcn() {
		String actTitle = driver.getTitle();
		String expTitle = "Google";
		Assert.assertEquals(expTitle, actTitle);
		System.out.println("Hard assertion- This statement will print only if the above validation is passed");
	}

}
