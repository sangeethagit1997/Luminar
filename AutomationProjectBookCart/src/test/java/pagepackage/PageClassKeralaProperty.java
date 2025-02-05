package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClassKeralaProperty {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[1]/header/nav/div/div[1]/a")
	WebElement Logo;
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")
	WebElement DistrictWise;
	
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/ul/li[1]/a")
	WebElement Ernakulam;
	
	@FindBy(xpath="//*[@id=\"prop-list\"]/div/div[2]/div[1]/div[1]/div[1]/div/a[2]")
	WebElement viewMore;
	
	@FindBy(id="name")
	WebElement ContactName;
	
	@FindBy(id="phone")
	WebElement PhoneNo;
	
//	@FindBy(id="email")
//	WebElement EmailId;
	
	//@FindBy(xpath="//*[@id=\"recaptcha-anchor\"]/div[3]")
	//WebElement checkBox;
	
	@FindBy(xpath="//*[@id=\"contact-agent-section\"]/form/button")
	WebElement sendbtn;
	
	public void title() {
		String actualTitle = driver.getTitle();
		System.out.println("Home page title is "+actualTitle);
	}
	
	public void logoVerfn() {
		boolean b = Logo.isDisplayed();
		if(b) {
			System.out.println("Logo verification test passed");
		}
		else {
			System.out.println("Logo verification test failed");
		}
	}
	
	public PageClassKeralaProperty(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Menu() throws InterruptedException {
		DistrictWise.click();
		Thread.sleep(2500);
	}
	
	public void subMenu() throws InterruptedException {
		Ernakulam.click();
		Thread.sleep(2500);
	}
	
	public void scroll() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		viewMore.click();
		Thread.sleep(2500);
		
	}
	
	public void QuickContact() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ContactName);
		ContactName.sendKeys("Sangeetha");
		PhoneNo.sendKeys("7034247965");
		//EmailId.sendKeys("sangeethasuresh51997@gmail.com");
		//checkBox.click();
		sendbtn.click();
		}

}
