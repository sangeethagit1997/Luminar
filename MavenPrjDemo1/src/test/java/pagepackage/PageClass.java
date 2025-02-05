package pagepackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageClass {
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement DropDown;
	
	@FindBy(id="")
	WebElement login;
	
	@FindBy(xpath="")
	WebElement dragsrc;
	
	@FindBy(xpath="")
	WebElement dragdest;
	
	public PageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void dropDown() {
		Select s = new Select(DropDown);
		s.selectByVisibleText(null);
	}
	
	public void Login(String user, String password) {
		login.sendKeys(user);
		login.sendKeys(password);
		login.click();
	}
	
	public void scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true);",login);
	}
	
	public void alertMethod() {
		Actions act = new Actions(driver);
		act.click().perform();
		act.doubleClick().perform();
		act.contextClick().perform();
		
		Alert a = driver.switchTo().alert();
		String alertText = a.getText();
		a.accept();
		
	}
	
	public void dragNDrop() {
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(dragsrc, dragdest).perform();
		
	}
	
	public void copyNPaste() {
		Actions act2 = new Actions(driver);
		dragsrc.sendKeys("ssd");
		act2.keyDown(dragsrc,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		act2.keyDown(dragsrc,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		act2.keyDown(dragdest,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		
			
	}
	
	public void screenshot() throws IOException {
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("C:\\Users\\TLTUser\\Desktop\\Luminar\\screenshot.png"));
	}

}
