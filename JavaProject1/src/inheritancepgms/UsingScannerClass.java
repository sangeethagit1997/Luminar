package inheritancepgms;

import java.util.Scanner;

class Member{
	public void PrintDetails() {
		System.out.println("enter name: ");
		Scanner nameob = new Scanner(System.in);
		String name = nameob.next();
		
		System.out.println("enter age: ");
		Scanner ageob = new Scanner(System.in);
		int age = ageob.nextInt();
		
		System.out.println("enter phone number: ");
		Scanner phoneob = new Scanner(System.in);
		int phoneno = phoneob.nextInt();
		
		System.out.println("enter salary: ");
		Scanner salob = new Scanner(System.in);
		double salary = salob.nextDouble();
	}
}

class Employee extends Member{
public void EmpMethod() {
	
	
}	
} 

class Manager extends Member{
public void ManMethod() {
	
	
}	
}
public class UsingScannerClass {

	public static void main(String[] args) {
		System.out.println("enter employee specialization: ");
		Scanner empob = new Scanner(System.in);
		String empspec = empob.next();
		
		System.out.println("enter manager dept: ");
		Scanner mngrob = new Scanner(System.in);
		String managrDept = mngrob.next();
		

	}

}
