package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_10
 * 13_13
 */

public class Rectangle2 extends GeometricObject implements Comparable<Rectangle2> {

	private double width = 1;
	private double height = 1;
	
	public Rectangle2(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle2() {
		
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
	
	@Override
	public int compareTo(Rectangle2 o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
	@Override 
	public boolean equals(Object o) {
		return this.compareTo((Rectangle2)o) == 0;
	}
	
}
