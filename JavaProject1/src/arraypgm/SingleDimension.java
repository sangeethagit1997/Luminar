package arraypgm;

import java.util.Scanner;

public class SingleDimension {

	public static void main(String[] args) {
		int arr[] = new int[3];
		Scanner ob = new Scanner(System.in);
		System.out.println("enter numbers");
		
		for(int i=0;i<3;i++) {
		arr[i] = ob.nextInt();
		}
		
		
		System.out.println("entered numbers are: ");
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
			}
		
	}

}
