package testpackage;

import org.testng.annotations.Test;

import pagepackage.PageClassKeralaProperty;

public class TestClassKeralaProperty extends BaseClassKeralaProperty{
	@Test
	public void keralaProperty() throws InterruptedException {
		PageClassKeralaProperty pg = new PageClassKeralaProperty(driver);
		pg.title();
		pg.logoVerfn();
		pg.Menu();
		pg.subMenu();
		pg.scroll();
		pg.QuickContact();
	}

}
