package ch13;
import java.util.Scanner;
import java.math.BigInteger;

/**
 * Chapter 13 Exercise 21:
 *
 *      (Algebra: vertex form equations)
 *      The equation of a parabola can be expressed in either standard form
 *      (y = ax^2 + bx + c) or vertex form (y = a(x - h)^2 + k).
 *      Write a program that prompts the user to enter a, b, and c as integers
 *      in standard form and displays h and k in the vertex form.
 *
 */

public class Chapter_13_E21_VertexFormEquations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b and c: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		RationalBigInteger cRational = new RationalBigInteger(
				new BigInteger(String.valueOf(c)), new BigInteger("1"));
		
		RationalBigInteger h = new RationalBigInteger(
				new BigInteger(String.valueOf(b)), new BigInteger(String.valueOf(-2 * a)));
		
		RationalBigInteger kPart = new RationalBigInteger(
				new BigInteger(String.valueOf(Math.pow(b, 2))), new BigInteger(String.valueOf(4 * a)));
		
		System.out.println("h is " + h + " and k is " + cRational.subtract(kPart));
		
	}

}
