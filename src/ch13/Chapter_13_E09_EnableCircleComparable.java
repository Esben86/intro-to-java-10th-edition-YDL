package ch13;

/**
 * Chapter 13 Exercise 9:
 *
 *      (Enable Circle comparable)
 *      Rewrite the Circle class in Listing 13.2 to extend
 *      GeometricObject and implement the Comparable interface.
 *      Override the equals method in the Object class. Two Circle objects
 *      are equal if their radii are the same. Draw the UML diagram that involves Circle,
 *      GeometricObject, and Comparable.
 *
 */

public class Chapter_13_E09_EnableCircleComparable {

	public static void main(String[] args) {
		
		Circle2 c1 = new Circle2(2);
		Circle2 c2 = new Circle2(2);
		Circle2 c3 = new Circle2(3.5);
		
		System.out.println("Are c1 and c2 equal? " + c1.equals(c2));
		System.out.println("Are c1 and c3 equal? " + c1.equals(c3));
		System.out.println("Are c2 and c3 equal? " + c2.equals(c3));

	}

}
