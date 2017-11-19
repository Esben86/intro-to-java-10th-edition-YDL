package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 23:
 *
 * (Geometry: point in a rectangle?)
 *
 */

public class Chapter_03_E23_PointInRectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates (x, y)");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double xDistance = x - 0;
		double yDistance = y - 0;
				
		if ((xDistance <= 10 / 2) && (yDistance <= 5.0 / 2))
			System.out.println("The point is in the rectangle");
		else
			System.out.println("The point is not in the rectangle");

	}

}
