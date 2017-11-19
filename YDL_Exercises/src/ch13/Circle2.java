package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_06
 */

public class Circle2 extends GeometricObject implements Comparable<Circle2> {
	
	private double radius = 1;
	
	public Circle2(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	public Circle2(){
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
		
	public String toString() {
		return "Radius: " + getRadius() + " Area: " + getArea();	 
	}
	
	@Override
	public int compareTo(Circle2 o) {
		if (getRadius() > o.getRadius())
			return 1;
		else if (getRadius() < o.getRadius())
			return -1;
		else 
			return 0;
	}
	
	@Override 
	public boolean equals(Object o) {
		return this.compareTo((Circle2)o) == 0;
	}
	
}
