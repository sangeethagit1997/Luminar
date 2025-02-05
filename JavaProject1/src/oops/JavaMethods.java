package oops;

import java.util.Scanner;

public class JavaMethods {

	public static void main(String[] args) {
		// area of circle
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r = s.nextDouble();
		double area = Math.PI * r * r;
		System.out.println("Area of Circle is: " + area);
		        
		//area of rectangle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		double width = scanner.nextDouble();
		double area1 = length * width;
		System.out.println("The area of the rectangle is: " + area1);
		
		// area of square
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		double side = sc.nextDouble();
		double squareArea = side * side;
		System.out.println("Area of the square: " + squareArea);
		
		//area of triangle
		 Scanner ob = new Scanner(System.in);
		 System.out.print("Enter the base of the triangle: ");
	     double base = ob.nextDouble();
	     System.out.print("Enter the height of the triangle: ");
	     double height = ob.nextDouble();
	     double areaTriangle = 0.5 * base * height;
	     System.out.println("The area of the triangle is " + areaTriangle);
	 }

}
