package inheritancepgms;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.AnimalMethod();
		l.LionMethod();
		
		Deer d =  new Deer();
		d.AnimalMethod();
		d.DeerMethod();

	}

}
 
class Species {
	public void AnimalMethod() {
		System.out.println("Animal details");
	}
}

class Lion extends Species {
	public void LionMethod() {
		System.out.println("lion details");
	}
}

class Deer extends Species {
	public void DeerMethod() {
		System.out.println("deer methods");
	}
}