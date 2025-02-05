package testngpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstPgm {
@BeforeTest
public void setUp() {
	System.out.println("Browser : Launch");
}
@BeforeMethod
public void urlLoad() {
	System.out.println("URL Loading");
}
@Test
public void test1() {
	System.out.println("Test--1 details");
}
@Test
public void test2() {
	System.out.println("Test---2 details");
}
@Test(priority = 1)
public void test3() {
	System.out.println("Test----3 details");
}
@AfterMethod
public void afterM() {
	System.out.println("After method details");
}
@AfterTest
public void tearDown() {
	System.out.println("Browser quit");
}
}
