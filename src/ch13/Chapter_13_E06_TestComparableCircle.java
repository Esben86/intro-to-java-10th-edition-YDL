package ch13;

/**
 * Chapter 13 Exercise 6:
 *
 *      (The ComparableCircle class)
 *      Define a class named ComparableCircle that extends Circle and implements Comparable.
 *      Draw the UML diagram and implement the compareTo method to compare the circles on the
 *      basis of area. Write a test class to find the larger of
 *      two instances of ComparableCircle objects.
 *
 */

public class Chapter_13_E06_TestComparableCircle {

	public static void main(String[] args) {
		
		ComparableCircle c1 = new ComparableCircle(3);
		ComparableCircle c2 = new ComparableCircle(4);
		
		System.out.println("Cirlce 1 " + c1);
		System.out.println("Circle 2 " + c2);
		
		System.out.println((c1.compareTo(c2) == 1) ? "\nCircle 1 is the largest of the two circles" :
													 "\nCircle 2 is the largest of the two circles");

	}

}
