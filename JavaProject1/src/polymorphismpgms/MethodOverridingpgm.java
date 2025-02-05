package polymorphismpgms;

class Father{
	public void Phone() {
		System.out.println("Father's phone is samsung");
	}
}

class Son extends Father{

	@Override
	public void Phone() {
		System.out.println("Son's phone is iPhone");
		super.Phone();
	}
	
}

public class MethodOverridingpgm {

	public static void main(String[] args) {
		Son ob = new Son();
		ob.Phone();
		
	}

}
