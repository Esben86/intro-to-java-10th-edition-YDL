package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented.
 * 
 * This class is used for Exercise:
 * 
 */

public abstract class ComparableGeometricObject implements Comparable<ComparableGeometricObject> {

	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected ComparableGeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected ComparableGeometricObject(String color, boolean filled) {
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
	public int compareTo(ComparableGeometricObject o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
	public static ComparableGeometricObject max(ComparableGeometricObject o1, ComparableGeometricObject o2) {
		return (o1.compareTo(o2) >= 0) ? o1 : o2;
	}
	
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
				" and filled: " + filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
			
}