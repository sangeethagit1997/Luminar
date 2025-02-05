package task19_11_2024;

public class Task1 {

	public static void main(String[] args) {
		//pattern1
		 int rows = 5; 
		 for (int i = 0; i < rows; i++) {
			 int number = i + 1;
			 int count = rows - i;
			 for (int j = 0; j < count; j++) {
	                System.out.print(number+" ");
	            }
	            System.out.println(); 
		 }
		
		//pattern2
			for (int p = 5; p >= 1; p--) {
				for (int q = 1; q <= p; q++) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }
}
