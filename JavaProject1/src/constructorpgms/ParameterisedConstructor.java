package constructorpgms;

public class ParameterisedConstructor {
	int empid;
	String empname;
	
	public ParameterisedConstructor(int empid, String empname) {
		this.empid=empid;
		this.empname=empname;
	}
	
	public void Display() {
		System.out.println(empid);
		System.out.println(empname);
	}

	public static void main(String[] args) {
		ParameterisedConstructor ob1 = new ParameterisedConstructor(101,"Sangeetha");
		//System.out.println(ob1.empid);
		ob1.Display();
		//System.out.println(ob1.empname);

	}

}
