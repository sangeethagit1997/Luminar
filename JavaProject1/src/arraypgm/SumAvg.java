package arraypgm;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size: ");
		int arraySize = sc.nextInt();
		int arr[] = new int[arraySize];
		int sum = 0;
		System.out.println("Enter the numbers: ");
		
		for(int i=0;i<arraySize;i++) {
		arr[i]=sc.nextInt();
		sum = sum + arr[i];
		}
		System.out.println("sum is "+sum);
		System.out.println("average is "+sum/arraySize);
	}

}
