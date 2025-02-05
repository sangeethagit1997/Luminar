package controlstatements;

public class Task3 {

	public static void main(String[] args) {
		// 5 factorial= 5*4*3*2*1=120
		int n=1;
		for(int i=1;i<=5;i++) {
			n=n*i;
		System.out.println(n);
		}
		
		//print 1 to 10 using while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//do while loop- print 'Luminar' 10 times
		int j=1;
		do {
			System.out.println("Luminar");
			j++;
		}
		while(j<=10);
		
		//using while loop reverse a number
		int number=567;
		int reversed_number=0;
		while(number>0) {
			int lastDigit=number%10; //get last digit from a number-take modulus
			reversed_number=reversed_number*10 + lastDigit;//store last digit in the variable
			number=number/10;
		}
		System.out.println(reversed_number);
		
		//find count of digits in a number
		int count = 0, num = 43452757;

	    while (num != 0) {
	       num = num/10;
	       count++;
	    }

	    System.out.println("Number of digits: " + count);
	    
	    //Armstrong Number
	    int number1=552;
	    int reminder;
	    int sum=0;
	    int temp=number1;
	    while(number1>0) {
	    	reminder=number1%10;
	    	sum=sum+(reminder*reminder*reminder);
	    	number1=number1/10;
	    }
	    if(temp==sum) {
	    	System.out.println("ARMSTRONG number");
	    }
	    else {
	    	System.out.println("Not armstrong");
	    }

	}

}
