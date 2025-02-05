package methods;

public class Task {

	public static void main(String[] args) {
		Task ob = new Task();
	
		System.out.println("area of the triangle is "+ob.areaTriangle(2, 2));
		System.out.println("area of rectangle "+ob.areaRectangle(5, 3));
		ob.areaCircle(10);
		ob.areaSquare();

	}
	//area of triangle
	public double areaTriangle(double base,double height) {
	double areaT = 0.5*base*height;
	return areaT;
	}
	
	//area of rectangle
	public int areaRectangle(int length, int breadth) {
		int areaR= length*breadth;
		return areaR;
	}
	//area of circle
	public void areaCircle(double radius) {
		double areaC= 3.14*radius*radius;
		System.out.println("area of circle is "+areaC);
		
	}
	//Area of square
	public void areaSquare() {
		int side=12;
		int areaSquare= side * side;
		System.out.println("area of square is "+areaSquare);
	
	}

}
