package controlstatements;

public class Task2 {

	public static void main(String[] args) {
		// check which number is greater among the 3
		int p=20,q=400,r=90;
		if(p>q && p>r) {
		System.out.println("p is greater");
		}
		else if(q>p && q>r) {
			System.out.println("q is greater");
		}
		else {
			System.out.println("r is greater");
		}
		
		//Nested if
		//Check if 55 is divisible by 5 & 11
		int i=22;
		if(i%5==0) {
			if(i%11==0) 
			{
			System.out.println("The number is divisible by both 5 & 11");
			}
			else
			{
				System.out.println("The number is divisible only by 5");
			
			}
					}
		else
		{
		System.out.println("The number is not divisble by both 5 & 11");
		}
			
	

	}

}
