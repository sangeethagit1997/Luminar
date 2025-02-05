package oops;

import java.util.Scanner;

public class PalindromeScannerpgm {
	
	public static void main(String[] args) {
	System.out.println("Enter a number");
	Scanner ob = new Scanner(System.in);
	int number = ob.nextInt();	
	int temp = number;
	int lastDigit, rev_num=0;
	
	while(number>0) {
		lastDigit = number%10;
		rev_num = rev_num*10 + lastDigit;
		number = number/10;
		}
	if(temp==rev_num) {
		System.out.println("PALINDROME");
	}
	else {
		System.out.println("NOT PALINDROME");
	}
	}

}
