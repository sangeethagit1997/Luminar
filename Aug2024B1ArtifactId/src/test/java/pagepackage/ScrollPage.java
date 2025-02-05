package pagepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollPage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement SearchBar;
	
	@FindBy(xpath="//*[@id=\"gh-btn\"]")
	WebElement SearchButton;
	
//	@FindBy(xpath="//*[@id=\"item52fe06e105\"]/div/div[1]/div/a/div/img")
//	WebElement item;
//	
	public ScrollPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void search() {
		SearchBar.sendKeys("bags");
		SearchButton.click();
	}
	public void scroll() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,500)"); // Scrolls down by 500 pixels

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"item4521e28a35\"]/div/div[2]/a/div/span")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

}
