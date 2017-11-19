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
 * 13_07
 * 13_11
 * 13_12
 * 
 */

public abstract class GeometricObject {

	protected String color = "white";
	protected boolean filled;
	protected java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
		
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
			
}
