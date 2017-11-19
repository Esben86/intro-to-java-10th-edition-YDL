package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 27:
 *
 * (Geometry: points in triangle?)
 *
 */

public class Chapter_03_E27_PointsInTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point (x, y): ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		if (x > 0 && y > 0 && ((x + (2 * y)) < 200))
			System.out.println("The point is inside the triangle");
		else
			System.out.println("The point is not inside the triangle");
		}
}
