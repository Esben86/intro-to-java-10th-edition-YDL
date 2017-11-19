package ch13;
import java.math.BigInteger;

/**
 * Chapter 13 Exercise 18:
 *
 *      (Use the Rational class)
 *      Write a program that computes the following
 *      summation series using the Rational class:
 *
 *      You will discover that the output is incorrect because of integer overflow (too large).
 *      To fix this problem, see Programming Exercise 13.15.
 *
 *
 */

public class Chapter_13_E18_SumRational {

	public static void main(String[] args) {
		
		RationalBigInteger sum = new RationalBigInteger(new BigInteger("1"), new BigInteger("2"));
		
		for (int i = 3; i < 100; i += 2) {
			Integer num = new Integer(i);
			Integer denom = new Integer(i + 1);
			
			System.out.println("Adding " + num.toString() + " / " + denom.toString());
			
			sum = sum.add(new RationalBigInteger(new BigInteger(num.toString()), new BigInteger(denom.toString())));
			
		}
		System.out.println("The sum is " + sum.doubleValue());
		
	}

}
