package oops;

import java.util.Scanner;

public class Scannerpgm {

	public static void main(String[] args) {
		// Scanner class
		System.out.println("Enter 2 numbers");//system.out means to display something in console
		//now create object for scanner class to access the methods
		Scanner ob=new Scanner(System.in);//system.in means to enter something in console
		int a=ob.nextInt();
		int b=ob.nextInt();
		int c=a+b;
		System.out.println("Sum of a & b is "+c);
		
		
		

	}

}
