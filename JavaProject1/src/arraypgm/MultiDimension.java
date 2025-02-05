package arraypgm;

import java.util.Scanner;

public class MultiDimension {

	public static void main(String[] args) {
		int[][] arr= new int[3][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter numbers");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
			arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}

	}

}
