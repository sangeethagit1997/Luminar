package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RishiHerbalPage {
WebDriver driver;

@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[1]/div[2]/div[2]/form/select")
WebElement sortbypopularity;

@FindBy(xpath="//*[@id=\"main\"]/div[2]/div[1]/div[3]/div[5]/div/div/a/h2")
WebElement neemchoorna;

//@FindBy(id="choose")
//WebElement chooseitem;

//@FindBy(xpath="//*[@id=\"product-67738\"]/div[2]/form/div/div[2]/button")
//WebElement addtocart;

public RishiHerbalPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void titleVerification() {
	String actualTitle=driver.getTitle();
	System.out.println(actualTitle);
	String expTitle = "RISHI HERBAL – Ayur Vivek";
	if(actualTitle.equals(expTitle)) {
		System.out.println("Title is verified successfully");
	}
	else {
		System.out.println("Title verification failed");
	}
}

public void dropdown() {
	WebElement sort = sortbypopularity;
	Select ele = new Select(sort);
	ele.selectByVisibleText("Sort by popularity");
}

public void selectLastItem() {
	WebElement scrolllastitem = neemchoorna;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeAsyncScript("window.scrollBy(0.document.body.scrollHeight)");
	js.executeScript("window.scrollBy(0,3000)");
	neemchoorna.click();
}

//public void addToCart() {
//	WebElement cartitem=chooseitem;
//	Select obj = new Select(cartitem);
//	obj.selectByVisibleText("100G");
//	addtocart.click();
//}


}
