package seleniumpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleResponseCdPgm {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}
	@Test
	public void linkCount() throws IOException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(WebElement element:links) 
		{
			String link = element.getAttribute("href");
			verify(link);
		}
	
			
}
	private void verify(String link) throws IOException {
		try {
			URL u = new URL(link);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			int code = con.getResponseCode();
			
			if(code==200) {
				System.out.println("200---------"+link);
			}
			else if(code==404) {
				System.out.println("404---------"+link);
			}
			else {
				System.out.println("other codes-------"+link);
			}
		} 
		catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		
	}
}


