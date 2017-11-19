package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 3:
 * 
 * (Algebra: solve 2 * 2 linear equations)
 *
 * Write a program that solves 2x2 equations using Cramers rule.
 */

public class Chapter_03_E03_LinearEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		if ((a * d) - (b * c) == 0)
			System.out.println("The equation has no solution");
		else 
			System.out.println("x = " + x + " and y = " + y);
	}

}
