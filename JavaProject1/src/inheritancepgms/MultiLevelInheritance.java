package inheritancepgms;

class Animal{
	public void AnimalMethod() {
		System.out.println("Animal class method");
	}
}
	class Dog extends Animal {
		public void DogMethod() {
			System.out.println("Dog class method");
		}
	}
	
	class Puppy extends Dog {
		public void PuppyMethod() {
			System.out.println("Puppy class method");
		}
	}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Puppy p = new Puppy();
		p.AnimalMethod();
		p.DogMethod();
		p.PuppyMethod();

	}

}
