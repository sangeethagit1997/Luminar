package trycatchpgm;

public class ExceptionHandlingpgm {

	public static void main(String[] args) {
		try {
			int a =10;
			int b=0;
			int c = a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello sangeetha");
		try {
			String s = null;
			int l = s.length();
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("error");	
		}

	}

}
