package controlstatements;

public class SwitchStatements {

	public static void main(String[] args) {
		int a=3;
		switch(a) 
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:System.out.println("No choice");
		
		}
		
		//switch program to check the size of shirt
		int size=40;
		switch(size) {
		case 28:System.out.println("Small");
		break;
		case 38:System.out.println("Medium");
		break;
		case 40:System.out.println("Large");
		break;
		case 46:System.out.println("ExtraLarge");
		break;
		default:System.out.println("UnKnown");
		}
		
		//simple calculator using switch
		int num1=25,num2=10;
		switch('%') {
		case '+':System.out.println("Sum="+(num1+num2));
		break;
		case '-':System.out.println("Difference="+(num1-num2));
		break;
		case '*':System.out.println("Product="+(num1*num2));
		break;
		case '/':System.out.println("Quotient="+(num1/num2));
		break;
		case '%':System.out.println("Remainder="+(num1%num2));
		break;
		default:System.out.println("No operation");
		}
		
		
	}

}
