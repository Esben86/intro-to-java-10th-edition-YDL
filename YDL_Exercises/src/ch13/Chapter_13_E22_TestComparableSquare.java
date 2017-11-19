package ch13;

/**
 * Chapter 13 Exercise 22:
 *
 *      (The ComparableSquare class)
 *      Define a class named ComparableSquare that extends Square and implements Comparable. 
 *      Draw the UML diagarm and implement the compareTo method to compare the Square on the
 *      basis of area. Write a test class to find the larger of the two instances of 
 *      ComparableSquare objects.
 *
 */

public class Chapter_13_E22_TestComparableSquare {

	public static void main(String[] args) {
		
		ComparableSquare s1 = new ComparableSquare(2);
		ComparableSquare s2 = new ComparableSquare(2);
		
		System.out.println(s1.compareTo(s2));
		
	}

}
