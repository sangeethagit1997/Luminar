package basicjava;

public class Task1 {

	public static void main(String[] args) {
		//1
		int x=23,y=45;
		System.out.println("Check the 2 numbers 23 and 45 are equal? "+(x==y));
		
		//2
		int a=55,b=70;
		
		System.out.println("Check the 2 conditions a<50 and a<b are true? "+(a<50 && a<b));
		
		//3 swap with variable
		int a1=20,b1=30;
		System.out.println("Before swapping a1="+a1);
		System.out.println("Before swapping b1="+b1);
		int c1;
		c1=a1;
		a1=b1;
		b1=c1;
		System.out.println("After swapping a1="+a1);
		System.out.println("After swapping b1="+b1);
		
		//4 swap without variable
		int a2=20,b2=30;
		System.out.println("Before swapping a2="+a2);
		System.out.println("Before swapping b2="+b2);
		a2=a2+b2;
		b2=a2-b2;
		a2=a2-b2;
		
		System.out.println("After swapping without variable,a2="+a2);
		System.out.println("After swapping without variable,b2="+b2);
		
		//5 print 2nd digit
		int j=17;
		int n=17%10;
		System.out.println("Given number is "+j);
		System.out.println("2nd digit is "+n);
	}

}
