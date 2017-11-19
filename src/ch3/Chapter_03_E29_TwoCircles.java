package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 29:
 *
 * (Geometry: two circles)
 *
 */

public class Chapter_03_E29_TwoCircles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle 1's center (x, y) and radius: ");
		double c1x = input.nextDouble();
		double c1y = input.nextDouble();
		double c1Radius = input.nextDouble();
		
		System.out.println("Enter circle 2's center (x, y) and radius: ");
		double c2x = input.nextDouble();
		double c2y = input.nextDouble();
		double c2Radius = input.nextDouble();
		
		double distanceBetweenCenters = Math.sqrt(Math.pow(c2x - c1x, 2) + Math.pow(c2y - c1y, 2));
		
		boolean c2InsideC1 = distanceBetweenCenters <= (c1Radius - c2Radius);
		boolean c2OverlapsC1 = distanceBetweenCenters <= (c1Radius + c2Radius);
		
		if (c2InsideC1)
			System.out.println("circle2 is inside circle1");
		else if (c2OverlapsC1)
			System.out.println("circle2 overlaps circle1");
		else
			System.out.println("circle2 does not overlap circle1");

	}

}
