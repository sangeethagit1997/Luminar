package arraypgm;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		int[] ar = new int[5];
		System.out.println("enter 5 real numbers: ");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			ar[i]= sc.nextInt();		
	}
	int pc = 0;
	int nc = 0;
	int zc = 0;
	
	for(int i=0;i<5;i++) 
	{
		if(ar[i]>0)
		{
			pc++;
		}
		else if(ar[i]<0)
		{
			nc++;
		}
		else {
			zc++;
		}
		
	}
	System.out.println("count of positive numbers "+pc);
	System.out.println("count of negative numbers "+nc);
	System.out.println("count of zeroes "+zc);
}

}
