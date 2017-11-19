package ch18;
import java.math.BigInteger;

/**
 * Chapter 18 Exercise 14
 * (Factorial)
 * 
 * Using the BigInteger class introduced in Section 10.9, you can
 * find the factorial for a large number (e.g., 100!). Implement the
 * factorial method using recursion. Write a program that prompts the
 * user to enter an integer and displays its factorial.
 *
 * Created by Luiz Arantes Sa on 11/30/14.
 */

public class Chapter_18_E01_FactorialBigInteger {

	public static void main(String[] args) {
		
		System.out.println(factorial(3));

	}
	
	public static BigInteger factorial(int n) {
		
		if (n == 0)
			return BigInteger.ONE;
		else
			return new BigInteger(String.valueOf(n)).multiply(factorial(--n));
		
	}

}
