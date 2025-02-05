package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LumaPage {
	WebDriver driver;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a/img")
	WebElement Logo;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(id="send2")
	WebElement SignIn;
	
	@FindBy(xpath="//*[@id=\"ui-id-3\"]")
	WebElement WhatsNew;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[4]/div[2]/div/div/ul[1]/li[1]/a")
	WebElement Hoodies;
	
	@FindBy(id="sorter")
	WebElement Sorter;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[12]/div/a/span/span/img")
	WebElement Item;
	
	@FindBy(xpath="//*[@id=\"option-label-size-143-item-168\"]")
	WebElement Size;
	
	@FindBy(xpath="//*[@id=\"option-label-color-93-item-56\"]")
	WebElement Color;
	
	@FindBy(id="product-addtocart-button")
	WebElement CartBtn;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[1]/a")
	WebElement CartIcon;
	
	@FindBy(id="top-cart-btn-checkout")
	WebElement ProceedBtn;
	
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/div/button")
	WebElement NextBtn;
	
	@FindBy(xpath="//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button")
	WebElement PlaceOrder;
	
	public LumaPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void titleVerification() {
		String actualTitle = driver.getTitle();
		System.out.println("Actual title is "+actualTitle);
		String expectedTitle = "Customer Login";
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title verification passed");
		}
		else {
			System.out.println("Title verification failed");
		}
	}
	
	public void logoVerification() {
		boolean b = Logo.isDisplayed();
		if(b) {
			System.out.println("Logo is displayed");
		}
		else {
			System.out.println("Logo is not displayed");
		}
	}
	
	public void signUp(String email,String pass) throws InterruptedException {
		Email.sendKeys(email);
		Password.sendKeys(pass);
		SignIn.click();
		Thread.sleep(3000);
		
	}
	
	public void searchNav() throws InterruptedException {
		WhatsNew.click();
		Thread.sleep(3000);
	}
	
	public void searchLink() {
		Hoodies.click();
	}
	
	public void stringPresent() {
		String pageSource = driver.getPageSource();
		String toCheck = "Recently Ordered";
		if(pageSource.contains(toCheck)) {
			System.out.println("Page source contains the searched string");	
	}
		else {
			System.out.println("Page source doesn't contains the searched string");
		}
	}
	
	public void dropDown() throws InterruptedException {
		Select s = new Select(Sorter);
		s.selectByValue("price");
		Thread.sleep(2000);
	}
	
	public void scrollBottom() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
	}
	
	public void addToCart() throws InterruptedException {
		Item.click();
		Thread.sleep(2000);
	}
	
	public void selectSize() throws InterruptedException {
		Size.click();
		Thread.sleep(2000);
	}
	
	public void selectColor() throws InterruptedException {
		Color.click();
		Thread.sleep(2000);
	}
	
	public void scrollDetail() throws InterruptedException {
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
	}
	public void cartBtn() throws InterruptedException {
		CartBtn.click();
		Thread.sleep(2500);
	}
	
	public void scrollUp() {
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,-600)");
	}
	
	public void cartIcon() throws InterruptedException {
		CartIcon.click();
		Thread.sleep(2500);
	}
	
	public void proceedChkOut() {
		ProceedBtn.click();
	}
	
	public void scrollNext() throws InterruptedException {
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2500);
	}
	
	public void nextBtn() throws InterruptedException {
		NextBtn.click();
		Thread.sleep(3000);
	}
	
	public void placeOrder() {
		PlaceOrder.click();
	}
	
//	public void browser() {
//		driver.quit();
//	}
//	
}
