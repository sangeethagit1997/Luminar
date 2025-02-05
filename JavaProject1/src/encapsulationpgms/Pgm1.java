package encapsulationpgms;

class Employee2{
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	private String EmpName;
	private int EmpId;
}



public class Pgm1 {

	public static void main(String[] args) {
		Employee2 ob = new Employee2();
		ob.setEmpName("VIVEK");
		ob.setEmpId(101);
		System.out.println(ob.getEmpName());
		System.out.println(ob.getEmpId());

	}

}
