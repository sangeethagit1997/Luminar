//package testngpackage;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class DataDrivenTest {
//ChromeDriver driver;
//@BeforeTest
//public void setUp() {
//	driver = new ChromeDriver();
//}
//@Test
//public void dataDrivenTest() throws IOException {
//	driver.get("https://www.facebook.com/");
//	FileInputStream fi = new FileInputStream("C:\\Users\\TLTUser\\Downloads\\Book 8.xlsx");
//	XSSFWorkbook wb = new XSSFWorkbook(fi);
//	XSSFSheet sh = wb.getSheet("Sheet1");
//	int rowCount = sh.getLastRowNum();
//	System.out.println("This count indicates how many rows in excel have data--->"+rowCount);
//	for(int i=1;i<=rowCount;i++) {
//		String UserName = sh.getRow(i).getCell(0).getStringCellValue();
//		System.out.println(UserName);
//		String password = sh.getRow(i).getCell(1).getStringCellValue();
//		System.out.println(password);
//		driver.findElement(By.name("email")).clear();
//		driver.findElement(By.name("email")).sendKeys(UserName);
//		driver.findElement(By.name("pass")).sendKeys(password);
//		driver.findElement(By.name("login")).click();
//		}
//}
//}
