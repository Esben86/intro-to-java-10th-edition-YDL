package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_07
 */

public class Square extends GeometricObject implements Colorable {

	protected double side = 1;
	
	public Square(double side, String color, boolean filled) {
		super(color, filled);
		this.side = side;
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public Square() {
		
	}
	
	public double getSide() {
		return side;
	}
		
	public double getPerimeter() {
		return side * 4;
	}
	
	public double getArea() {
		return Math.pow(side, 2);
	}
	
	public String toString() {
		return "Side: " + side + " Area: " + getArea(); 						
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all sides\n");
	}
	
}