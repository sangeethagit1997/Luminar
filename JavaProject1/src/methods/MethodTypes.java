package methods;

public class MethodTypes {

	public static void main(String[] args) {
	MethodTypes ob = new MethodTypes();
	ob.add();
	System.out.println("difference is "+ob.sub());
	ob.mul(45, -1);
	System.out.println("quotient is "+ob.div(1, 0));

	}
	// without return type & parameters
	public void add() {
		int a=10,b=15;
		int c=a+b;
		System.out.println("sum is "+c);
	}
	//with return type & without parameters
	public int sub() {
		int d=40,e=50;
		int ans=e-d;
		return ans;
	}
	//without return type & with parameters
	public void mul(int x,int y) {
		int prod = x*y;
		System.out.println("product is "+prod);
	}
	//with return type & parameters
	public double div(double p,double q) {
		double quotient= p/q;
		return quotient;
	}

}
