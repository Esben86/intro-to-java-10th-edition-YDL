package ch13;

/**
 * Chapter 13 Exercise 14:
 *
 *  (Demonstrate the benefits of encapsulation)
 *      Rewrite the Rational class in Listing 13.13 using a new internal
 *      representation for the numerator and denomina- tor. Create an array
 *      of two integers as follows:
 *      private long[] r = new long[2];
 *      Use r[0] to represent the numerator and r[1] to represent the denominator.
 *      The signatures of the methods in the Rational class are not changed, so a client
 *      application that uses the previous Rational class can continue to use this new Rational
 *      class without being recompiled.
 *
 */

public class Chapter_13_E14_ReviseRational {

	public static void main(String[] args) {

		Rational r1 = new Rational(1, 2);
		Rational r2 = new Rational(1, 3);
		
		System.out.println("r1 + r2 = " + r1.add(r2));
		System.out.println("r2 - r1 = " + r2.subtract(r1));
		System.out.println("r1 * r2 = " + r1.multiply(r2) );
		System.out.println("r1 / r2 = " + r1.divide(r2));
		
		System.out.println("Are r1 and r2 equal? " + r1.equals(r2));
		System.out.println("Are r1 and new Rational(1, 2) equal? " + r1.equals(new Rational(1, 2)));
		
	}

}
