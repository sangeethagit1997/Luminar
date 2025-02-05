package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlazeDemoRegisterPage {
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id="company")
	WebElement Company;
	
	@FindBy(id="email")
	WebElement Email;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="password-confirm")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement RegisterButton;
	
	@FindBy(xpath="//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")
	WebElement LoginLink;
	
	@FindBy(id="email")
	WebElement LoginFormEmail;
	
	@FindBy(id="password")
	WebElement LoginFormPassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement LoginButton;

	

	
	public BlazeDemoRegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterDetails(String formname,String companyname, String formemail, String formpass, String formconfirmpass) {
	Name.sendKeys(formname);
	Company.sendKeys(companyname);
	Email.sendKeys(formemail);
	Password.sendKeys(formpass);
	ConfirmPassword.sendKeys(formconfirmpass);
	}
	
	public void register() throws InterruptedException {
		RegisterButton.click();
		Thread.sleep(3000);
		LoginLink.click();
		
	}
	public void login(String loginemail,String loginpassword) {
		LoginFormEmail.sendKeys(loginemail);
		LoginFormPassword.sendKeys(loginpassword);
		LoginButton.click();
	}
	
	

}
