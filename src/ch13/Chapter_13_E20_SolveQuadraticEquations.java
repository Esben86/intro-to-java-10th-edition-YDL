package ch13;

import java.util.Scanner;

/**
 * Chapter 13 Exercise :
 *
 *      (Algebra: solve quadratic equations)
 *      Rewrite Programming Exercise 3.1 to obtain imaginary roots
 *      if the determinant is less than 0 using the Complex class
 *      in Programming Exercise 13.17.
 *
 */

public class Chapter_13_E20_SolveQuadraticEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b and c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		if ((Math.pow(b, 2) - (4 * a * c)) > 0)
			System.out.println("The roots are " + x1 + " and " + x2);
			else if ((Math.pow(b, 2) - (4 * a * c)) == 0) 
				System.out.println("The root is " + x1);
		else {
			double ai = -b / 2 * a;
			double bi1 = Math.sqrt(- Math.pow(b, 2) + 4 * a * c) / (2 * a);
			double bi2 = -(Math.sqrt(- Math.pow(b, 2) + 4 * a * c) / (2 * a));
			
			System.out.println("The roots are " + new Complex (ai, bi1) + " and " + new Complex(ai, bi2));
			
		}
			

	}

}
