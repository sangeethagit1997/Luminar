package abstractpgm;

import java.util.Scanner;

interface Bank{
	void accountdetails();
	void balance();
	void withdraw();
	void deposit();
	
	
}

class Sbi implements Bank{
	
	int	initial_balance = 5000;
	int withdraw_balance=0;
	
	@Override
	public void accountdetails() {
		System.out.println("Enter Account Holder Name :");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		
		System.out.println("Enter Account Number :");
		Scanner ac = new Scanner(System.in);
		int ac_no = ac.nextInt();		
	}

	@Override
	public void balance() {
		System.out.println("Current balance is "+initial_balance);
		
	}

	@Override
	public void withdraw() {
		System.out.println("Enter Withdraw Amount: ");
		Scanner w = new Scanner(System.in);
		int withdrawAmt = w.nextInt();
		int withdraw_balance = initial_balance-withdrawAmt;
		System.out.println("Balance after withdraw is  :"+withdraw_balance);
		
	}

	@Override
	public void deposit() {
		System.out.println("Enter Deposit Amount: ");
		Scanner d = new Scanner(System.in);
		int depositAmt = d.nextInt();
		int TotalAmt = depositAmt+withdraw_balance;
		System.out.println("final deposit is : "+TotalAmt);
		
	}

	
	
}
public class BankApp {
	
	public static void main(String[] args) {
	
	Sbi sbi = new Sbi();
	sbi.accountdetails();
	sbi.balance();
	sbi.withdraw();
	sbi.deposit();
	

	}

}
