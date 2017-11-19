package ch13;

/**
 * Chapter 13 Exercise 11:
 *
 *      (The Octagon class)
 *      Write a class named Octagon that extends GeometricObject and implements
 *      the Comparable and Cloneable inter- faces. Assume that all eight sides
 *      of the octagon are of equal length. The area can be computed using the
 *      following formula:
 *      area = (2 + 4/22)* side * side
 *      Draw the UML diagram that involves Octagon, GeometricObject, Comparable, and Cloneable.
 *      Write a test program that creates an Octagon object with side value 5
 *      and displays its area and perimeter. Create a new object using the clone method
 *      and compare the two objects using the compareTo method.
 *
 */

public class Chapter_13_E11_TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon o1 = new Octagon(5);
		Octagon o2 = (Octagon)o1.clone();
		
		System.out.println("o1: ");
		System.out.println(o1);
		System.out.println("\no2: ");
		System.out.println(o2);
		
		System.out.println("\nAre o1 and o2 equal? " + o1.equals(o2));
		System.out.println("compareTo() (0 means equal): " + o1.compareTo(o2) );

	}

}
