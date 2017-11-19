package ch12;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private static int numberOfObjects;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) 
			throws IllegalTriangleException {
		super(color,filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		isValid(this);
		numberOfObjects++;
		
	}
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public boolean isValid(Triangle triangle) 
			throws IllegalTriangleException {
		if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) 
		  return true;
		else throw new IllegalTriangleException("Invalid triangle");
		
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	@Override
	public String toString() {
		return "Triangle: side1 =  " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}

}
