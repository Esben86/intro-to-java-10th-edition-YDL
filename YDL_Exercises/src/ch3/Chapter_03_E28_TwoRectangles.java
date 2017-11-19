package ch3;
import java.util.Scanner;

/**
 * Chapter 3 Exercise 28:
 *
 * (Geometry: two rectangles)
 *
 */

public class Chapter_03_E28_TwoRectangles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center (x, y), width and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();
		
		System.out.println("Enter r1's center (x, y), width and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
		double xDistance = (r1x >= r2x) ? (r1x - r2x) : (r2x - r1x);
		double yDistance = (r1y >= r2y) ? (r1y - r2y) : (r2y - r1y);
		
		boolean r2InsideR1 = xDistance < ((r1Width - r2Width) / 2) && yDistance < ((r1Height - r2Height) / 2);
		boolean r2OverlapsR1 = xDistance < ((r1Width + r2Width) / 2) && yDistance < ((r1Height + r2Height) / 2);
		
		if (r2InsideR1)
			System.out.println("r2 is inside r1");
		else if (r2OverlapsR1)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");

	}

}
