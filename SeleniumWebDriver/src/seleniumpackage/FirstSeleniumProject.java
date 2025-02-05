package seleniumpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();//launch browser
		driver.get("http://ayurvivek.com/manufacturer/rishi-herbal/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "m.facebook.com";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test passed");
		}
		else
			System.out.println("Test Failed");
		driver.quit();

	}
	
	

}
