package testngpackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUploadAutoit {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
	}
	@Test
	public void fileUpload() throws InterruptedException, IOException {
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[4]/a/span")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\TLTUser\\Desktop\\Luminar\\AutoItScript\t1.exe");
		Thread.sleep(3000);
	}

}
