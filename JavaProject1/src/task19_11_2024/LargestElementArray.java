package task19_11_2024;
import java.util.Scanner;
public class LargestElementArray {

	public static void main(String[] args) 
	    { 
	    	 Scanner ob = new Scanner(System.in);

	         System.out.println("Enter the size of the array:");
	         int size = ob.nextInt();
	         int[] array = new int[size];

	         System.out.println("Enter  elements:");
	         for (int i = 0; i < size; i++) {
	             array[i] = ob.nextInt();
	         }

	         int largest = array[0]; 
	         for (int i = 1; i < size; i++) {
	             if (array[i] > largest) {
	                 largest = array[i];
	             }
	         }
	         System.out.println("The largest element in the array is: " + largest);  
	    }
	}
	
		

	


