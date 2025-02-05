package testpackage;

import org.testng.annotations.Test;

import pagepackage.RishiHerbalPage;

public class RishiHerbalTest extends BaseClassRishiHerbal{
	@Test
	public void testMethod() {
		RishiHerbalPage ob =new RishiHerbalPage(driver);
		ob.titleVerification();
		ob.dropdown();
		ob.selectLastItem();
		//ob.addToCart();
		
		
	}
	

}
