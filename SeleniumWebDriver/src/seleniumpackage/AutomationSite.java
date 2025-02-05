package seleniumpackage;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationSite {
ChromeDriver driver;
@Before
public void setUp() {
	driver = new ChromeDriver();
	driver.get("https://www.automationexercise.com/");
	driver.manage().window().maximize();
}
@Test
public void siteAutomate() throws InterruptedException {
	//title verification
	String actTitle = driver.getTitle();
	System.out.println("Actual Title---"+actTitle);
	String expTitle = "Automation Exercise";
	if(actTitle.equals(expTitle)) {
		System.out.println("Title verification passed");
	}
	else
	{
		System.out.println("Title verification failed");
	}
	
	//logo verification
	WebElement logo = driver.findElement(By.xpath("/html/body/header/div/div/div/div[1]/div/a/img"));
	boolean b1 = logo.isDisplayed();
	if(b1) {
		System.out.println("Logo Displayed");
	}
	else {
		System.out.println("Logo not displayed");
	}
	
	//login/signup
	
	driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")).click();
	List<WebElement> linkscount = driver.findElements(By.tagName("a"));
	int TotalLinks = linkscount.size();
	System.out.println("Total links count----"+TotalLinks);
	
	driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]")).sendKeys("Sanisha");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sanishasuresh@gmail.com");
	driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[4]/input")).sendKeys("san123");
	
	WebElement daydetails = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select"));
	Select dd = new Select(daydetails);
	dd.selectByValue("5");
	
	WebElement monthdetails = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select"));
	Select md = new Select(monthdetails);
	md.selectByValue("7");
	
	WebElement yeardetails = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select"));
	Select yd = new Select(yeardetails);
	yd.selectByValue("1994");
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[1]/input")).sendKeys("Sanisha");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[2]/input")).sendKeys("Suresh");
	driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("TLT");
	driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Pathanamthitta");
	
	WebElement countrydetails = driver.findElement(By.xpath("//*[@id=\"country\"]"));
	Select cd = new Select(countrydetails);
	cd.selectByVisibleText("India");
	
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[7]/input")).sendKeys("Kerala");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[8]/input")).sendKeys("Pathanamthitta");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[9]/input")).sendKeys("689533");
	driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[10]/input")).sendKeys("8965412789");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	WebElement el = driver.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button"));
	wait.until(ExpectedConditions.elementToBeClickable(el)); 
	el.click();
	
	
}
}
