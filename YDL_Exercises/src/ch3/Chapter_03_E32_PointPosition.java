package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 32:
 *
 * (Geometry: point position)
 *
 */

public class Chapter_03_E32_PointPosition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("ENter three points for p0, p1 and p2: ");
		
		// Get points for p0
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		// Get points for p1
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// Get points for p2
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		
		if (result == 0)
			System.out.println("(" + x2 + "," + y2 + ") is on the same line as (" + x0 + "," + y0 + ") and (" + x1 + "," + y1 + ")");
		else if (result > 0)
			System.out.println("(" + x2 + "," + y2 + ") is on the left side of the line from (" + x0 + "," + y0 + ") and (" + x1 + "," + y1 + ")");
		else
			System.out.println("(" + x2 + "," + y2 + ") is on the right side of the line from (" + x0 + "," + y0 + ") and (" + x1 + "," + y1 + ")");

	}

}
