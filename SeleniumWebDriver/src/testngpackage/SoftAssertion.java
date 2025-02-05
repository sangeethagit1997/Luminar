package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertion {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	@Test
	public void softAssert() {
		driver.get("https://m.facebook.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Facebook – log in or sign up";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");}
	
	System.out.println("Soft Assertion- This statement will print even if the above test failed");
	
}
}
