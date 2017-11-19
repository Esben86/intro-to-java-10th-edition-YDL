package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 22:
 *
 * (Geometry: point in a circle?)
 *
 */

public class Chapter_03_E22_PointInCircle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a point with two coordinates (x, y)");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));
		
		if (distance <= 10)
			System.out.println("The point is in the circle");
		else
			System.out.println("The point is not in the circle");

	}

}
