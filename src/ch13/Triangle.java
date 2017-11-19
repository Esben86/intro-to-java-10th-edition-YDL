package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_01
 * 13_13
 */

public class Triangle extends GeometricObject {
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 3;
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		super(color, filled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(){
		
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public double getArea() {
		double s = (side1 + side2 + side3) / 2.0;
		
		return Math.sqrt(s * (s - side1 ) * (s - side2) * (s - side3));	
	}
	
	public String toString() {
		return "side1: " + side1 + " side2: " + side2 + " side3: " + side3 
				+ "\nColor: " + getColor() 
				+ "\nFilled? " + isFilled()
				+ "\nPerimeter: " + getPerimeter() 
				+ "\nArea: " + getArea()
				+ "\nDate created: " + getDateCreated();
	}
	

}
