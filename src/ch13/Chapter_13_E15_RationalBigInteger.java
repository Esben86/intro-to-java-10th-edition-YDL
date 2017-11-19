package ch13;
import java.math.BigInteger;

/**
 * Chapter 13 Exercise 15:
 *
 *      (Use BigInteger for the Rational class)
 *      Redesign and implement the Rational class in Listing 13.13 using BigInteger for
 *      the numerator and denominator.
 *
 */

public class Chapter_13_E15_RationalBigInteger {

	public static void main(String[] args) {
		
		RationalBigInteger n1 = new RationalBigInteger(new BigInteger("1"), new BigInteger("2"));
		RationalBigInteger n2 = new RationalBigInteger(new BigInteger("1"), new BigInteger("2"));
		
		System.out.println("n1 + n2 = " + n1.add(n2));
		System.out.println("n1 - n2 = " + n1.subtract(n2));
		System.out.println("n1 * n2 = " + n1.multiply(n2));
		System.out.println("n1 / n2 = " + n1.divide(n2));
		System.out.println("Are n1 and n2 equal? " + n1.equals(n2));
		

	}

}
