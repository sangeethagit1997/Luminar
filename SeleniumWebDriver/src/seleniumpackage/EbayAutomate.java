package seleniumpackage;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAutomate {
	ChromeDriver driver;
	
	@Before 
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void bprintTitle() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";

		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title verification test passed");
		}
		else {
			System.out.println("Title verification test Failed");
		}
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/header/table/tbody/tr/td[2]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/header/table/tbody/tr/td[2]/div/div/table/tbody/tr/td/ul[1]/li[2]/a")).click();
	}
		
	
	
	
	@Test
		public void cstringPresent() {
			String pgsrc = driver.getPageSource();
			String toChk = " Shop by category";
			if(pgsrc.contains(toChk)) {
				System.out.println("Shop by Category is present");	
		}
			else {
				System.out.println("Shop by Category is not present");
			}
			//driver.findElement(By.xpath("/html/body/div[3]/div/div/div/header/div[1]/ul[2]/li[6]/div/a[1]")).click();
		
	
	}
	
	@Test 
	public void dsearch() {
		driver.findElement(By.xpath("/html/body/div[2]/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div/div/input")).sendKeys("books");
	}
}

	
	
	
