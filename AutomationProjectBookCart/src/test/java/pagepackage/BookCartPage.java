package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BookCartPage {
	
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"mat-input-0\"]")
	WebElement Username;
	
	@FindBy(xpath="//*[@id=\"mat-input-1\"]")
	WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/div/app-login/div/mat-card/mat-card-content/form/mat-card-actions/button/span[2]")
	WebElement Loginbtn;
	
	@FindBy(xpath="/html/body/app-root/app-nav-bar/mat-toolbar/mat-toolbar-row/div[2]/app-search/form/input")
	WebElement Searchbar;
	
	@FindBy(xpath="//*[@id=\"mat-option-108\"]/span")
	WebElement SearchedText;
	
	
	public BookCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String user,String pass) throws InterruptedException {
		Username.sendKeys(user);
		Password.sendKeys(pass);
		Loginbtn.click();
		Thread.sleep(3000);
	}
	
	
//	public void scroll() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//	}
//	
	
	public void search(String text) throws InterruptedException {
		Searchbar.sendKeys(text);
		SearchedText.click();
		Thread.sleep(3000);
		
	}
	
//	public void scroll() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		
//	}
//	

}
