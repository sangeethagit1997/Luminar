package testngpackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerPgm {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		//driver.manage().window().maximize();

}
	@Test
	public void datePicktest() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/form/div[2]/div[2]/img")).click();
		datePickMethod("December 2024","23");
	}
	private void datePickMethod(String expmonth, String expdate) 
	{
		while(true) {
			String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();////*[@id=\"ui-datepicker-div\"]/div/div/span[1]
			System.out.println(month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]")).click();////*[@id=\"ui-datepicker-div\"]/div/a[2]/span
			}
		}
		List<WebElement> date=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));////*[@id="ui-datepicker-div"]/table/tbody/tr[4]/td[2]/a
		for(WebElement d:date)
		{
			String datetext=d.getText();
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
		}
		
	}
	}
