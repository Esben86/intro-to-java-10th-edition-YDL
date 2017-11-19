package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_05
 */

public class Rectangle extends ComparableGeometricObject {

	private double width = 1;
	private double height = 1;
	
	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public String toString() {
		return "Width: " + width + " Height: " + height + " Area: " + getArea(); 
				
				
	}
	
}
