package abstractpgm;

interface TVRemote{
public void brand();
void model();
void compatibledevices();
}

interface SmartTVRemote extends TVRemote{
void connectivity();
void controllertype();
}

class TV implements SmartTVRemote{

	@Override
	public void brand() {
		System.out.println("Brand : Generic");
		
	}

	@Override
	public void model() {
		System.out.println("Model : NEECH29GVZ7L6W");
		
	}

	@Override
	public void compatibledevices() {
		System.out.println("Compatible Devices : Television");
		
	}

	@Override
	public void connectivity() {
		System.out.println("Connectivity : Bluetooth");
		
	}

	@Override
	public void controllertype() {
		System.out.println("Controller Type : IR");
	}
	
}

public class InterfaceTask {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.brand();
		tv.compatibledevices();
		tv.connectivity();
		tv.controllertype();
		tv.model();

	}

}
