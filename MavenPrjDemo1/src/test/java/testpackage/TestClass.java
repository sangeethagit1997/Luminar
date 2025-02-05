package testpackage;

import org.testng.annotations.Test;

import pagepackage.PageClass;



public class TestClass extends BaseClass{
@Test
public void mainMethod() {
	PageClass pc = new PageClass(driver);
	
}
}
