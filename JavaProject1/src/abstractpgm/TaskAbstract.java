package abstractpgm;

abstract class Users{
public void name1() {
	System.out.println("Sangeetha");
};	
public void name2() {
	System.out.println("Vivek");
};	
abstract public void qual();
abstract public void addr();


}

class User1 extends Users{

	@Override
	public void qual() {
		System.out.println("Qualification of user is Btech");
		
	}

	@Override
	public void addr() {
		System.out.println("Address of user is Pathanamthitta");
		
	}
	
}

class User2 extends Users{

	@Override
	public void qual() {
		System.out.println("Qualification of user is Bcom");
		
	}

	@Override
	public void addr() {
		System.out.println("Address of user is Kollam");
		
	}
	
}

public class TaskAbstract {

	public static void main(String[] args) {
		User1 u1= new User1();
		u1.name1();
		u1.addr();
		u1.qual();
		
		User2 u2= new User2();
		u2.name2();
		u2.addr();
		u2.qual();

	}

}
