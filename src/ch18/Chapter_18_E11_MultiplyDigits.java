package ch18;

/**
 * Chapter 18 Exercise 11
 * (Multiply the digits in an integer using recursion)
 * 
 * Write a recursive method that computes the sum of
 * the digits in an integer. Use the following method header:
 *
 * public static int sumDigits(long n)
 *
 * For example, mulDigits(234) returns 2 * 3 * 4 = 24. Write a test program
 * that prompts the user to enter an integer and displays its sum.
 *

 */

public class Chapter_18_E11_MultiplyDigits {

	public static void main(String[] args) {
		
		System.out.println(mulDigits(234));

	}
	
	public static int mulDigits(int digit) {
		
		if (digit / 10 == 0) 
			return digit;
		else
			return (digit % 10) * (mulDigits(digit / 10));
	}

}
