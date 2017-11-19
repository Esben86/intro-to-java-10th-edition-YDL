package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 1:
 * 
 * (Algebra: solve quadratic equations)
 * 
 */

public class Chapter_03_E01_SolveQuadraticEquations {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b and c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double x1 = (- b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		double x2 = (- b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
		
		if ((Math.pow(b, 2) - (4 * a * c)) > 0)
			System.out.println("The equation has two roots " + x1 + " and " + x2);
			else if ((Math.pow(b, 2) - (4 * a * c)) == 0) 
				System.out.println("The equation has one root " + x1);
		else
			System.out.println("The equation has no real roots");
		

	}

}
