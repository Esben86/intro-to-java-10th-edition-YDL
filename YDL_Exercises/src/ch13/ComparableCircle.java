package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_06
 */

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	//compareToMethod here
	@Override
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else 
			return 0;
	}
	
}
