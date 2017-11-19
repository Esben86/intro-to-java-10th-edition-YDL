package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 34:
 *
 * (Geometry: point on line segment)
 *
 */

public class Chapter_03_E34_PointsOnLine {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three points for p0, p1 and p2: ");
		
		// Get points for p0
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		// Get points for p1
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// Get points for p2
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double position = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		boolean isOnLineSegment = (position == 0) && x2 > x0 && x2 < x1 && y2 > y0 && y2 < y1;
		
		if (isOnLineSegment)
			System.out.println("(" + x2 + ", " + y2 + ") is on the same line segment from (" + x0 + ", " + y0 + ")"
					+ " to (" + x1 + ", " + y1 + ")");
		else
			System.out.println("(" + x2 + ", " + y2 + ") is not on the same line segment from (" + x0 + ", " + y0 + ")"
					+ " to (" + x1 + ", " + y1 + ")");
		

	}

}
