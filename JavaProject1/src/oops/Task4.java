package oops;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		//print A-Z using loop
		
		for(char letters='A';letters<='Z';letters++) {
			System.out.println(letters);
		}
		//print odd numbers from 1 to 99
		
		for(int i=1;i<100;i++) {
		if(i%2!=0) {
			System.out.println(i);
		}	
		}
		
		//Fibonacci series
		int n = 100; 
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
		
		
	}

}
