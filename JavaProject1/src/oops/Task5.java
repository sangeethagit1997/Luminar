package oops;

import java.util.Scanner;

public class Task5 {
	static boolean isPrime(int number){
		if(number<=1) 
			return false;

		for(int i=2; i<number; i++) {
	        if(number%i == 0) 
	            return false;}

	    return true;
	  }
	public static void main(String[] args) {

	    int number = 0;
	    boolean flag = false;
	    Scanner ob = new Scanner(System.in);
	    System.out.print("Enter number: ");
	    number = ob.nextInt();
	    flag  = isPrime(number);
	    if(flag) {
	       System.out.println("prime number");}
	    else {
	       System.out.println("Not a prime number");}
}

}
