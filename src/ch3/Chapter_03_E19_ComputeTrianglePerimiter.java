package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 19:
 *
 * (Compute the perimeter of a triangle)
 *
 */

public class Chapter_03_E19_ComputeTrianglePerimiter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of three sides: ");
						
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		boolean isTriangle = ((side1 + side2 > side3) && 
							  (side1 + side3 > side2) &&
							  (side2 + side3 > side1));
		
		if (isTriangle)
			System.out.println("The perimiter is: " + (side1 + side2 + side3));
		else
			System.out.println("The triangle is not valid");

	}

}
