package ch13;

/**
 * Chapter 13 Exercise 10:
 *
 *      (Enable MyRec2 comparable)
 *      Rewrite the MyRec2 class in Listing 13.3 to extend GeometricObject
 *      and implement the Comparable interface. Override the equals method in
 *      the Object class. Two MyRec2 objects are equal if their areas are the same.
 *      Draw the UML diagram that involves MyRec2, GeometricObject, and Comparable.
 *
 */

public class Chapter_13_E10_EnableComparableRectangle {

	public static void main(String[] args) {
		
		Rectangle2 r1 = new Rectangle2(2, 4);
		Rectangle2 r2 = new Rectangle2(4, 2);
		Rectangle2 r3 = new Rectangle2(2.1, 4);
		
		System.out.println("Are r1 and r2 equal? " + r1.equals(r2));
		System.out.println("Are r1 and r3 equal? " + r1.equals(r3));
		System.out.println("Are r2 and r3 equal? " + r2.equals(r3));

	}

}
