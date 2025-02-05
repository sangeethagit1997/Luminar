package seleniumpackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitDemoPgm {
	ChromeDriver driver; //object is declared here to access in all methods(scope public)
	@Before
	public void setUp() {
		//ChromeDriver driver = new ChromeDriver();(scope private)
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void printTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void stringPresent() {
		String pagesrc = driver.getPageSource();
		String toCheck = "Gmail";
		if(pagesrc.contains(toCheck)) {
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is absent");
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
