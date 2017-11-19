package ch13;

/**
 * Chapter 13 Exercise 5:
 *
 *  (Enable GeometricObject comparable)
 *  Modify the GeometricObject class to implement the Comparable interface,
 *  and define a static max method in the GeometricObject class for finding
 *  the larger of two GeometricObject objects. Draw the UML diagram and implement
 *  the new GeometricObject class. Write a test program that uses the max method
 *  to find the larger of two circles and the larger of two rectangles.
 *  
 */

public class Chapter_13_E05_CompareGeometricObject {

	public static void main(String[] args) {
		
		ComparableGeometricObject r1 = new Rectangle(4, 4);
		ComparableGeometricObject r2 = new Rectangle(4, 4);
		System.out.println("The largest rectangle is: ");
		System.out.println(ComparableGeometricObject.max(r1, r2));
		
	}

}
