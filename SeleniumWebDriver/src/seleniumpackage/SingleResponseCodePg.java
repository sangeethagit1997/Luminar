package seleniumpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


import org.junit.Test;


public class SingleResponseCodePg {
	String link = "https://www.facebook.com/";
	
	@Test
	public void responseCd() throws IOException {
		try {
			URL u = new URL(link);
			HttpURLConnection con = (HttpURLConnection)u.openConnection();
			int code = con.getResponseCode();
			System.out.println(code);
			if(code==200) {
				System.out.println("response code is 200");
			}
			else if(code==400) {
				System.out.println("response code is 400");
			}
			else {
				System.out.println("other codes");
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
