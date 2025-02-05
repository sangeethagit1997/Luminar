package testpackage;

import org.testng.annotations.Test;

import pagepackage.ScrollPage;

public class ScrollTest extends ScrollBaseClass{
	@Test
public void ebayScroll() {
	ScrollPage sp = new ScrollPage(driver);
	sp.search();
	sp.scroll();
}
}
