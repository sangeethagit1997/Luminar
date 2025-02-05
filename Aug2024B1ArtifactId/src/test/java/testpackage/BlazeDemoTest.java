package testpackage;

import org.testng.annotations.Test;

import pagepackage.BlazeDemoRegisterPage;

public class BlazeDemoTest extends BaseClassBlazeDemo{
	@Test
public void register() throws InterruptedException {
BlazeDemoRegisterPage obj=new BlazeDemoRegisterPage(driver);
obj.enterDetails("Sangeetha", "TLT", "sangeethasuresh51997@gmail.com", "San12345", "San12345");
obj.register();
obj.login("Sangeetha", "San12345");

}
	

}
