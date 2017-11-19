package ch13;

/*
 * package 13 might seem to contain a redundancy of classes. These classes are related to the 
 * geometrical shapes, and have almost identical content, but with a slight difference on how
 * the Comparable interface and compareTo / equals methods are implemented. It was not possible
 * to complete all the exercises with one single class for each geometric object, so several
 * classes has been created to make sure that all test classes run without errors.
 * 
 * This class is used for Exercise:
 * 13_22
 */

public class ComparableSquare extends Square implements Comparable<ComparableSquare> {
	
	public ComparableSquare(double side, String color, boolean filled) {
		super(side, color, filled);
	}
	
	public ComparableSquare(double side) {
		this.side = side;
	}
	
	public ComparableSquare() {
		
	}
	
	@Override
	public int compareTo(ComparableSquare s) {
		
		if (getArea() > s.getArea())
			return 1;
		else if (getArea() < s.getArea())
			return -1;
		else 
			return 0;
		
	}

}
