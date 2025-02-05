package controlstatements;

public class ControlStatements {

	public static void main(String[] args) {
		// if
		int a=5;
		if(a>0) 
		{
			System.out.println("a is greater than zero");
		}
		
		//if else
		int c=10,d=15;
		if(c>10) {
			System.out.println("c is greater");
		}
		else
		{
			System.out.println("d is greater");
		}
		
		//even/odd program
		int n=67908;
		if(n%2==0) {
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		
		//check if a number is positive or negative
		//else if
		
		double number=7975.7745;
		if(number>0) {
			System.out.println("positive number");
		}
		else if(number==0){
		System.out.println("Neutral number");	
		}
		
		else {
			System.out.println("Negative number");
		}
		
	

	}

}
