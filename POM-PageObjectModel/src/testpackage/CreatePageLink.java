package testpackage;

import org.testng.annotations.Test;

import pagepackage.CreatePageP;



public class CreatePageLink extends BaseClassFB{
	
@Test
public void testLogin() {
CreatePageP cp=new CreatePageP(driver);
cp.createPageClick();
cp.titleverification();
cp.signUpbutton();

}
}
