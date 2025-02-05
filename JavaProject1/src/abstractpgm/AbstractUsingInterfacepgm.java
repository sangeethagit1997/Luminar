package abstractpgm;

interface FourWheelers 
{
	public void payload();
	public void wheelbase();
	void fueltank();
	
}
	class Audi implements FourWheelers
	{

		@Override
		public void payload() {
			System.out.println("Audi Payload");
			
		}

		@Override
		public void wheelbase() {
			System.out.println("Audi wheelbase");
			
		}

		@Override
		public void fueltank() {
			System.out.println("Audi fuel capacity");
			
		}
		
	}
	
	class Maruthi implements FourWheelers{

		@Override
		public void payload() {
			System.out.println("maruthi payload");
			
		}

		@Override
		public void wheelbase() {
			System.out.println("maruthi wheel base");
			
		}

		@Override
		public void fueltank() {
			System.out.println("MARUTHI fuel capacity");
			
		}
		
	}


public class AbstractUsingInterfacepgm {

	public static void main(String[] args) {
		Audi a = new Audi();
		a.fueltank();
		a.payload();
		a.wheelbase();
		
		Maruthi m= new Maruthi();
		m.fueltank();
		m.payload();
		m.wheelbase();

	}

}
