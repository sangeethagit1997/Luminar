package testpackage;

import org.testng.annotations.Test;

import pagepackage.LumaPage;

public class LumaTest extends BaseClassLuma {
	@Test
	public void luma() throws InterruptedException {
		LumaPage lp = new LumaPage(driver);
		lp.titleVerification();
		lp.logoVerification();
		lp.signUp("sangeethasuresh51997@gmail.com", "Sangeetha@123");
		lp.searchNav();
		lp.searchLink();
		lp.stringPresent();
		lp.dropDown();
		lp.scrollBottom();
		lp.addToCart();
		lp.selectSize();
		lp.selectColor();
		lp.scrollDetail();
		lp.cartBtn();
		lp.scrollUp();
		lp.scrollUp();
		lp.cartIcon();
		lp.proceedChkOut();
		lp.scrollNext();
		lp.nextBtn();
		lp.placeOrder();
		//lp.browser();
	}

}
