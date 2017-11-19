package ch2;

/**
 * Chapter 2 Exercise 18:
 *
 * (Print a table)
 *
 * Write a program that prints a table which displays the middle point
 * of a set of given points.
 */

public class Chapter_02_E18_PrintTable {

	public static void main(String[] args) {
		
		System.out.println("  a        b      Middle Point");
		System.out.println("(0, 0)   (2, 1)    (" + ((2.0 + 0) / 2) + ", " + ((1.0 + 0) / 2) + ")");
		System.out.println("(1, 4)   (4, 2)    (" + ((4.0 + 1) / 2) + ", " + ((2.0 + 4) / 2) + ")");
		System.out.println("(2, 7)   (6, 3)    (" + ((6.0 + 2) / 2) + ", " + ((3.0 + 7) / 2) + ")");
		System.out.println("(3, 9)   (10, 5)   (" + ((10.0 + 3) / 2) + ", " + ((5.0 + 9) / 2) + ")");
		System.out.println("(4, 11)  (12, 7)   (" + ((12.0 + 4) / 2) + ", " + ((7.0 + 11) / 2) + ")");

	}

}
