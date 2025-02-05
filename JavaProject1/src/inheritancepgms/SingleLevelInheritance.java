package inheritancepgms;

class Parent {
	
public void Display() {
	System.out.println("parent class");
	
}

}

class Child extends Parent {
	public void Childfn() {
		System.out.println("child class");
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Child ob = new Child();
		ob.Childfn();
		ob.Display();

	}

}
