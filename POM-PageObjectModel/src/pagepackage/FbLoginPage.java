package pagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//can be done in 2 ways -using By class & page factory
public class FbLoginPage {
	WebDriver driver;
	//By fbemail = By.id("email");
	//By fbpassword = By.id("pass");
	//By fbloginbutton = By.id("login");
	
	@FindBy(id="email")
	WebElement fbemail;
	
	@FindBy(id="pass")
	WebElement fbpassword;
	
	@FindBy(name="login")
	WebElement fbloginbutton;
	
	
	public FbLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValues(String email, String password) {
		//driver.findElement(fbemail).sendKeys(email);
		//driver.findElement(fbpassword).sendKeys(password);
		
		fbemail.sendKeys(email);
		fbpassword.sendKeys(password);
	}
	public void login() {
		//driver.findElement(fbloginbutton).click();
		fbloginbutton.click();
	}

}
