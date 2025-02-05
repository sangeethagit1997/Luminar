package polymorphismpgms;

public class MethodOverLoading {//same method name but different signatures(params/order/datatype)

	public static void main(String[] args) {
	MethodOverLoading ob = new MethodOverLoading();
	ob.add();
	ob.add(10, 17);
	ob.add(75.2, 10);
	ob.add(2, 3.21);

	}
	
	public void add() {
	int a=5,b=3;
	int c=a+b;
	System.out.println(c);
	}
	
	public void add(int a,int b) {
		int add2 = a+b;
		System.out.println(add2);

	}
	public void add(double a,int b) {
		double add3 = a+b;
		System.out.println(add3);
	}
	public void add(int a, double b) {
		double add4 = a+b;
		System.out.println(add4);
	}

}
