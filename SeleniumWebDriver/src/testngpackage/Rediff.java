package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {//Task - logo & title verification of Rediff
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?ref_id=&sangeetha.2024");
		
	}
	@BeforeMethod
	public void urlLoading() {
		driver.manage().window().maximize();
	
	}
	@Test
	public void titleVerfcn() {
		String actTitle = driver.getTitle();
		System.out.println("Actual title - "+actTitle);
		String expTitle = "Rediffmail Free Unlimited Storage";
		if(actTitle.equals(expTitle)) {
			System.out.println("Title verification passed");
		}
		else {
			System.out.println("Title verification failed");
		}
	}
	@Test
	public void logoVerfcn() {
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		boolean b1 = logo.isDisplayed();
		if(b1) {
			System.out.println("Logo Displayed");
		}
		else {
			System.out.println("Logo not displayed");
		}
	}
	@AfterMethod
	public void aftrMeth() {
		System.out.println("After method details...");
	}
	@AfterTest
	public void aftrTest() {
		System.out.println("After test details");
	}
	

}
