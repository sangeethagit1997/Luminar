package oops;

import java.util.Scanner;

public class NameScannerpgm {

	public static void main(String[] args) {
	System.out.println("Enter name");
	Scanner ob = new Scanner(System.in);
	String name = ob.nextLine();
	for(int i=1;i<=10;i++) {
		System.out.println(name);
	}

	}

}
