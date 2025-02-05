package testpackage;


import org.testng.annotations.Test;

import pagepackage.BookCartPage;

public class BookCartTest extends BookCartBaseClass{
	@Test
	public void BookCart() throws InterruptedException {
		BookCartPage bc =new BookCartPage(driver);
		bc.Login("ssuresh2", "Ssuresh@1");
		bc.search("Slayer");
		//bc.scroll();
	}

}
