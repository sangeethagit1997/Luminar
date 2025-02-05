package oops;

import java.util.Scanner;

public class StringPalindromeMethod {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s)) {
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}

	}

}
