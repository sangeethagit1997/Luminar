package abstractpgm;

abstract class Car{
	abstract public void acceleration();
	abstract public void enginespeed();
	public void speedlimit() {
		System.out.println("speed limit details");
	}
}

class Bmw extends Car{

	@Override
	public void acceleration() {
		System.out.println("acceleration details");
		
	}

	@Override
	public void enginespeed() {
		System.out.println("engine speed details");
		
	}
	
}



public class Pgm1 {

	public static void main(String[] args) {
		Bmw b = new Bmw();
		b.acceleration();
		b.enginespeed();
		b.speedlimit();
		

	}

}
