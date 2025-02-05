package seleniumpackage;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPg {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void linkCount() {
		List<WebElement> linkscount = driver.findElements(By.tagName("a"));
		int lc = linkscount.size();
		System.out.println("Total count of links in google home page = "+lc);
		
		for(WebElement element: linkscount) {
			
			String link = element.getAttribute("href");
			String linktext = element.getText();
			System.out.println("Link is "+link);
			System.out.println("Link text is "+linktext);
			
		}
	}

}
