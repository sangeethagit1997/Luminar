package basicjava;

public class Operators {

	public static void main(String[] args) {
		// Arithmetic Operators
		int a=10, b=4;
		System.out.println("Sum ="+(a+b));
		System.out.println("Difference="+(a-b));
		System.out.println("Product="+(a*b));
		System.out.println("Quotient="+(a/b));
		System.out.println("Remainder="+(a%b));
		
		//Assignment Operators
		int c=a;
		System.out.println(c);
		System.out.println("value of a+=b is "+(a+=b));
		System.out.println("Value of a-=b is "+(a-=b));
		
		//Relational Operators
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical Operators
		String username="Sangeetha";
		String password="San@123";
		System.out.println(username =="Sangeetha"&&password=="San@123");
		System.out.println(username=="Sangeetha"||password=="San");
		
		//Unary operators
		
		int j=10;
		j++;//post increment 
		System.out.println(j++);
		System.out.println(j);
		++j;//pre increment
		System.out.println(j);
		
		int i=20;
		i--;//post decrement
		System.out.println(i--);
		System.out.println(i);
		--i;//pre decrement
		System.out.println(i);
		
		//Ternary Operators
		
		int a1=5,a2=10;
		String result=a1>a2?"false":"true";
		System.out.println(result);

	}

}
